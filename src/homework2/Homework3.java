package homework2;

/*Задача 3:
Составьте программу, выводящую на экран квадраты чисел от 10 до 20
включительно.
 */

public class Homework3 {
    public static void main(String[] args) {
        int a = 9;
        do {
            a++;
            System.out.println(Math.pow(a, 2));
        } while (a < 20);


    }
}
