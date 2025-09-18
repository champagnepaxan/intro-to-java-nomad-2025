import java.util.Scanner;

public class Beec1003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        int result = first + second;
        System.out.println("SOMA = " + result);
        in.close();
    }
}
