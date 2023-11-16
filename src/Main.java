import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short num = scanner.nextShort();

        if (num == 2 || num == 1) {
            System.out.println("YES");
        } else {
            short pow = 2;

            while (pow != num) {
                pow *= 2;

                if (pow == num) {
                    System.out.println("YES");
                } else if (pow > num) {
                    System.out.println("NO");
                    break;
                }
            }

        }


    }
}