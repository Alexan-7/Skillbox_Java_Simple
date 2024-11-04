import java.util.Scanner;

public class WhileSumUntil {
    public static void main(String[] args) {
        int sum = 0;
//        int value = -1;
        System.out.println("Input your values: ");

//        while (value != 0) {
//            value = new Scanner(System.in).nextInt();
//            sum = sum + value;

        // удобнее использовать While
        for (int value = -1; value != 0; ) {
            value = new Scanner(System.in).nextInt();
            sum = sum + value;
        }

        System.out.println("Сумма введённых чисел = " + sum);
    }
}
