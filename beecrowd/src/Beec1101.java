import java.util.Scanner;

public class Beec1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int M = sc.nextInt();
            int N = sc.nextInt();

            if (M <= 0 || N <= 0) {
                break;
            }

            int start = Math.min(M, N);
            int end = Math.max(M, N);
            int sum = 0;


            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
                sum += i;
            }

            System.out.println("Sum=" + sum);
        }

        sc.close();
    }
}
