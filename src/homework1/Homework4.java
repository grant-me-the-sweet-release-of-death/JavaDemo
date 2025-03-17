package homework1;

public class Homework4 {
    public static void main(String[] args) {
        double a = 5.499999999999999; //after 14 nines, if you add one more, it counts 5.499... as 5.5, which rounds it to 6
        System.out.println(Math.round(a));
    }
}
