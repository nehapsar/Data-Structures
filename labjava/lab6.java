package SixProducerConsumer;

class SharedResource {
    private int data;
    private boolean available = false; // Indicates whether data is available for consumption

    public synchronized int getData() {
        while (!available) {
            try {
                wait(); // Wait if data is not available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notify(); // Notify producer that data has been consumed
        return data;
    }

    public synchronized void setData(int value) {
        while (available) {
            try {
                wait(); // Wait if data is still available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        available = true;
        notify(); // Notify consumer that new data is available
    }
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




package SixProducerConsumer;

class Producer extends Thread {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            resource.setData(i);
            System.out.println("Produced: " + i);
            try {
                Thread.sleep(1000); // Simulate production time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package SixProducerConsumer;




public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();
    }
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





package SixProducerConsumer;

class Consumer extends Thread {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            int value = resource.getData();
            System.out.println("Consumed: " + value);
            try {
                Thread.sleep(1500); // Simulate consumption time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
