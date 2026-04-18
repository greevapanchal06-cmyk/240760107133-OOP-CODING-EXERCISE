import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Check if valid triangle
        if (a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2;

            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Area of triangle = " + area);
        } else {
            System.out.println("Invalid triangle sides");
        }
    }
}
