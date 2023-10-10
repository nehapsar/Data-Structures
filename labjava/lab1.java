//the  class person to be created
package OneInheritance;

class Person {
	 protected String name;
	 protected String address;
	 protected String phoneNo;
	 protected String emailId;

	 public Person(String name, String address, String phoneNo, String emailId) {
	     this.name = name;
	     this.address = address;
	     this.phoneNo = phoneNo;
	     this.emailId = emailId;
	 }

	 public void displayDetails() {
	     System.out.println("Name: " + name);
	     System.out.println("Address: " + address);
	     System.out.println("Phone No: " + phoneNo);
	     System.out.println("Email ID: " + emailId);
	 }
	}


//the class staff to be created

package OneInheritance;

import java.util.Scanner;

class Staff extends Person implements Staff_Op {
	 private int empId;
	 private String company;
	 private String designation;
	 private double salary;

	 public Staff(String name, String address, String phoneNo, String emailId, int empId, String company, String designation) {
	     super(name, address, phoneNo, emailId);
	     this.empId = empId;
	     this.company = company;
	     this.designation = designation;
	 }

	 public void displayDetails() {
	     super.displayDetails();
	     System.out.println("Employee ID: " + empId);
	     System.out.println("Company: " + company);
	     System.out.println("Designation: " + designation);
	     System.out.println("Salary: $" + salary);
	 }

	 public void calculateSalary() {
	     Scanner scanner = new Scanner(System.in);
	     System.out.print("Enter salary for " + name + ": $");
	     salary = scanner.nextDouble();
	     this.salary=salary+(salary*0.15);
	     scanner.nextLine(); // Consume the newline character
	     System.out.print("Your Final Salary is"+this.salary);
	     scanner.close();
	 }
	}

//the interface staff_op is created

package OneInheritance;

interface Staff_Op {
	 void calculateSalary();
	}

// the interface studen_op is created


package OneInheritance;

interface Student_Op {
	 void calculateFees();
	}


//the class student is created

package OneInheritance;

import java.util.Scanner;


class Student extends Person implements Student_Op {
	 private String usn;
	 private String branch;
	 private double fees;

	 public Student(String name, String address, String phoneNo, String emailId, String usn, String branch) {
	     super(name, address, phoneNo, emailId);
	     this.usn = usn;
	     this.branch = branch;
	 }

	 public void displayDetails() {
	     super.displayDetails();
	     System.out.println("USN: " + usn);
	     System.out.println("Branch: " + branch);
	     System.out.println("Fees: $" + fees);
	 }

	 public void calculateFees() {
	     Scanner scanner = new Scanner(System.in);
	     System.out.print("Enter fees for " + name + ": $");
	     fees = scanner.nextDouble();
	     this.fees += (fees*0.18);

	     scanner.nextLine(); // Consume the newline character
	     System.out.print("Your Final fees is"+this.fees);
	     scanner.close();
	 }
	}
// the main class is created

package OneInheritance;

import java.util.Scanner;



public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter staff details:");
     System.out.print("Name: ");
     String staffName = scanner.nextLine();
     System.out.print("Address: ");
     String staffAddress = scanner.nextLine();
     System.out.print("Phone No: ");
     String staffPhoneNo = scanner.nextLine();
     System.out.print("Email ID: ");
     String staffEmailId = scanner.nextLine();
     System.out.print("Employee ID: ");
     int empId = scanner.nextInt();
     scanner.nextLine(); // Consume the newline character
     System.out.print("Company: ");
     String company = scanner.nextLine();
     System.out.print("Designation: ");
     String designation = scanner.nextLine();

     Staff staff = new Staff(staffName, staffAddress, staffPhoneNo, staffEmailId, empId, company, designation);
     staff.calculateSalary();

     System.out.println();
     staff.displayDetails();

     System.out.println();

     System.out.println("Enter student details:");
     System.out.print("Name: ");
     String studentName = scanner.nextLine();
     System.out.print("Address: ");
     String studentAddress = scanner.nextLine();
     System.out.print("Phone No: ");
     String studentPhoneNo = scanner.nextLine();
     System.out.print("Email ID: ");
     String studentEmailId = scanner.nextLine();
     System.out.print("USN: ");
     String usn = scanner.nextLine();
     System.out.print("Branch: ");
     String branch = scanner.nextLine();

     Student student = new Student(studentName, studentAddress, studentPhoneNo, studentEmailId, usn, branch);
     student.calculateFees();

     System.out.println();
     student.displayDetails();

     scanner.close();
 }
}
