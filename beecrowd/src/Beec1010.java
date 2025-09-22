import java.util.Scanner;

public class Beec1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int code1 = input.nextInt();
        int qty1 = input.nextInt();
        double price1 = input.nextDouble();

        int code2 = input.nextInt();
        int qty2 = input.nextInt();
        double price2 = input.nextDouble();

        double sum = qty1 * price1 + qty2 * price2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", sum);

        input.close();
    }
}
