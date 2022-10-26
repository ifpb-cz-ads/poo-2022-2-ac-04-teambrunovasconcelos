import java.util.Scanner;

public class BMExercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um valor para x");
        int x = input.nextInt();
        int y;

        do {
            if (x % 2 == 0) {
                y = x / 2;
                System.out.println(y);

            } else {
                y = 3 * x + 1;
                System.out.println(y);
            }
            x = y;

        } while (y != 1);
        input.close();

    }
}
