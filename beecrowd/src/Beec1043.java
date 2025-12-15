import java.util.Scanner;

public class Beec1043 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        if (A < B + C && B < A + C && C < A + B) {
            double perimeter = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimeter);
        } else {
            double area = ((A + B) * C) / 2.0;
            System.out.printf("Area = %.1f%n", area);
        }

        input.close();
    }
}
