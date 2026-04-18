import java.util.Scanner;

public class CramersRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values of a, b, c, d, e, f:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        double D = (a * d) - (b * c);

        if (D == 0) {
            System.out.println("No unique solution (D = 0)");
        } else {
            double Dx = (e * d) - (b * f);
            double Dy = (a * f) - (e * c);

            double x = Dx / D;
            double y = Dy / D;

            System.out.println("Value of x = " + x);
            System.out.println("Value of y = " + y);
        }
    }
}
