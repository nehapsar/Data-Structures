//the class circle is createdpackage TwoPackage;
public class Circle {
    private int radius;
    
    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
    	return 3.142 * this.radius * this.radius;
        
    }
}


//the class squre is to be created
package TwoPackage;

public class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public double calculateArea() {
       return this.side * this.side;
    }
}


// the class trinangle is to be create
package TwoPackage;

public class Triangle {
    private int height;
    private int base;

    public Triangle(int height,int base) {
        this.height = height;
        this.base = base;
    }

    public double calculateArea() {
        return 0.5 * this.base * this.height;
    }
}


//the main class is created


package TwoPackage;
import TwoPackage.*;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Area of the Square:");
        System.out.println(square.calculateArea());

        Triangle triangle = new Triangle(6,5);
        System.out.println("Area of the Triangle:");
        System.out.println(triangle.calculateArea());

        Circle circle = new Circle(5);
        System.out.println("Area of the Circle:");
        System.out.println(circle.calculateArea());
    }
}
