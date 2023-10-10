//the class dot matrixprinter is createsd
package ThreePolymorphism.Abstraction;

class DotMatrix extends Printer {
	 public DotMatrix(String model) {
	     super(model);
	 }

	 public void configuration() {
	     System.out.println("Dot-matrix Printer configuration:");
	     // Add specific configuration details for Dot-matrix printers here
	 }
	}



//the class laserject is craeted
package ThreePolymorphism.Abstraction;

class LaserJet extends Printer {
	 public LaserJet(String model) {
	     super(model);
	 }

	 public void configuration() {
	     System.out.println("LaserJet Printer configuration:");
	     // Add specific configuration details for LaserJet printers here
	 }
	}

//the main class is created


package ThreePolymorphism.Abstraction;

import java.util.Scanner;


public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     Printer printer = null;

     while (true) {
         System.out.println("\nMenu: \n 1. Create Dot-matrix Printer \n2. Create LaserJet Printer \n3. Display Printer Configuration \n4. Exit \nEnter your choice: ");
         int choice = scanner.nextInt();
         switch (choice) {
             case 1:
                 System.out.print("Enter Dot-matrix Printer model: ");
                 String dotMatrixModel = scanner.next();
                 printer = new DotMatrix(dotMatrixModel);
                 break;
             case 2:
                 System.out.print("Enter LaserJet Printer model: ");
                 String laserJetModel = scanner.next();
                 printer = new LaserJet(laserJetModel);
                 break;
             case 3:
                 if (printer != null) {
                     printer.configuration();
                     printer.display();
                 } else {
                     System.out.println("Please create a printer first.");
                 }
                 break;
             case 4:
                 System.out.println("Exiting the program...");
                 scanner.close();
                 System.exit(0);
             default:
                 System.out.println("Invalid choice. Try again.");
         }
     }
 }
}




//the printer class is created

package ThreePolymorphism.Abstraction;

abstract class Printer {
	 private String model;

	 public Printer(String model) {
	     this.model = model;
	 }

	 public abstract void configuration();

	 public void display() {
	     System.out.println("Printer Model: " + model);
	 }
	}





//333333333333333333333333333333444444444444444444444444466666666666666666666666666666666666666666666666666666666666666666666


//runtime polymorphism


//the class car is created


package ThreePolymorphism.RuntimePolymorphism;

class Car extends Vehicle {
	 @Override
	 void displayType() {
	     System.out.println("This is a car.");
	 }
	}







//the class motorcycle is created



package ThreePolymorphism.RuntimePolymorphism;
class Motorcycle extends Vehicle {
	 @Override
	 void displayType() {
	     System.out.println("This is a motorcycle.");
	 }
	}


//the class vehicle is created


package ThreePolymorphism.RuntimePolymorphism;

abstract class Vehicle{
	 public void drive() {
	     System.out.println("Driving a vehicle...");
	 }

	 abstract void displayType();
	}



//the main class


package ThreePolymorphism.RuntimePolymorphism;


public class Main {
 public static void main(String[] args) {
     Vehicle vehicle1 = new Car();
     Vehicle vehicle2 = new Motorcycle();

     vehicle1.drive();
     vehicle1.displayType();

     vehicle2.drive();
     vehicle2.displayType();
 }
}
