import java.util.Scanner;

public class Beec1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade1 = input.nextDouble();
        double grade2 = input.nextDouble();
        double grade3 = input.nextDouble();

        double weightSum = 2 + 3 + 5;
        double media = (grade1 * 2 + grade2 * 3 + grade3 * 5) / weightSum;

        System.out.printf("MEDIA = %.1f%n", media);
        input.close();
    }
}

