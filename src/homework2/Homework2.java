package homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t > -5) {
            System.out.print("Warm");
        } else if (-5 >= t && t > -20) {
            System.out.print("Normal");
        } else {
            System.out.print("Cold");
        }
        scanner.close();
    }
}
