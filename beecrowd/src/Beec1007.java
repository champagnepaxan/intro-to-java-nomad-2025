import java.util.Scanner;

public class Beec1007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int n4 = scan.nextInt();

        int result = (n1 * n2) - (n3 * n4);

        System.out.println("DIFERENCA = " + result);
        scan.close();
    }
}
