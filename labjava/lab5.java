+package FiveThreads;


class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 10; i <= 15; i++) {
            System.out.println("Running "+this.getName() +" : "+ i);
            try {
                Thread.sleep(600); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}








//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



package FiveThreads;
class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running  "+this.getName()+" : "+ i);
            try {
                Thread.sleep(1500); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package FiveThreads;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.setName("Thread One");
        System.out.println(thread1.getName());
        thread2.setName("Thread Two");
        System.out.println(thread2.getName());

        thread1.start();
        thread2.start();
        while(thread1.isAlive() || thread2.isAlive()) {
        System.out.println(thread1.getName()+" : "+thread1.getState());
        System.out.println(thread2.getName()+" : "+thread2.getState());
        Thread.sleep(1000);
        }        

            thread1.join();
            thread2.join();

        System.out.println("Both threads have finished.");
    }
}








