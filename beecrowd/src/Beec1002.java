import java.util.Scanner;

public class Beec1002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();
        final double PI = 3.14159;
        double area = PI * Math.pow(R, 2);
        System.out.printf("A=%.4f%n", area);
        input.close();
    }
}
