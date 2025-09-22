import java.util.Scanner;

public class Beec1012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        double triangle = (A * C) / 2.0;
        double circle = 3.14159 * C * C;
        double trapezoid = ((A + B) * C) / 2.0;
        double square = Math.pow(B, 2);
        double rectangle = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangle);
        System.out.printf("CIRCULO: %.3f%n", circle);
        System.out.printf("TRAPEZIO: %.3f%n", trapezoid);
        System.out.printf("QUADRADO: %.3f%n", square);
        System.out.printf("RETANGULO: %.3f%n", rectangle);

        scan.close();
    }
}

