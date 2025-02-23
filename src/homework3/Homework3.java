package homework3;

public class Homework3 {
    public static void main(String[] args) {
        int fullnumber = 689;
        int hundredsdigit = fullnumber / 100;
        int tensdigit = (fullnumber % 100) / 10;
        int units = fullnumber % 10;
        int sum = hundredsdigit + tensdigit + units;
        System.out.println(hundredsdigit);
        System.out.println(tensdigit);
        System.out.println(units);
        System.out.println(sum);
    }
}
