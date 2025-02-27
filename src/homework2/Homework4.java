package homework2;

/*Необходимо, чтоб программа выводила на экран вот такую последовательность:
7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
 */

public class Homework4 {
    public static void main(String[] args) {
        int a = 0;

        do {
            int b = a += 7;
            System.out.print(b + " ");
        } while (a < 98);

    }
}
