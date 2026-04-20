**AIM**
/*Define a Java class named Rectangle. It should have two double data fields: width and height, both 
with a default value of 1. Implement a no-argument constructor and a constructor that takes width 
and height as parameters. Include methods getArea() and getPerimeter() that return the calculated 
area and perimeter respectively. */

 import java.util.*;

class Rectangle {
    double width = 1;
    double height = 1;

    // No-argument constructor
    Rectangle() {
        width = 1;
        height = 1;
    }

    // Parameterized constructor
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();              // default
        Rectangle r2 = new Rectangle(5, 10);         // parameterized

        System.out.println("Rectangle 1:");
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());
    }
} 
