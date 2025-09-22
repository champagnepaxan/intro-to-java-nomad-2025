import java.util.Scanner;

public class Beec1009 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String employeeName = reader.next(); // считываем, но не используем
        double fixed = reader.nextDouble();
        double sold = reader.nextDouble();

        double totalIncome = fixed + sold * 0.15;

        System.out.printf("TOTAL = R$ %.2f%n", totalIncome);

        reader.close();
    }
}

