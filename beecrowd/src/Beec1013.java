import java.util.Scanner;

public class Beec1013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        int maxXY = (x + y + Math.abs(x - y)) / 2;
        int maxAll = (maxXY + z + Math.abs(maxXY - z)) / 2;

        System.out.println(maxAll + " eh o maior");

        input.close();
    }
}

