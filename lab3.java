package lab3;

interface Vehicle {
 void drive();
}

abstract class AbstractVehicle implements Vehicle {
 public abstract void drive();
}

class Car extends AbstractVehicle {
 @Override
 public void drive() {
     System.out.println("Car is being driven!");
 }
}

class Motorcycle extends AbstractVehicle {
 @Override
 public void drive() {
     System.out.println("Motorcycle is being ridden!");
 }
}

public class Main {
 public static void main(String[] args) {
     Vehicle vehicle1 = new Car();
     Vehicle vehicle2 = new Motorcycle();

     vehicle1.drive(); // Output: Car is being driven!
     vehicle2.drive(); // Output: Motorcycle is being ridden!
 }
}
