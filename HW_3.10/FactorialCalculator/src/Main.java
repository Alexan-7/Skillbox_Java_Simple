/** Напишите программу, которая будет считать факториал переданного в консоли числа. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long factorial = 1; // до 59!
        System.out.println("Введите целое число для нахождения его факториала: ");

        int value = new Scanner(System.in).nextInt();
        System.out.print("Факториал числа " + value);

        for (; value >= 1; value--) {
            factorial *= value;
            // System.out.println(factorial);
        }
        System.out.println(" равен " + factorial);
    }
}