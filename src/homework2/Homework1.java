package homework2;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.print("четное");
        } else {
            System.out.print("нечетное, ю из ступид");
        }
        scanner.close();
    }
}
