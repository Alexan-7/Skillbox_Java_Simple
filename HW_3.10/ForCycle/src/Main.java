/**
 * Напишите программу, которая будет находить все пары положительных целых чисел,
 * произведение которых будет равно значению value. Например, если ввести число 6,
 * программа должна выдать следующий результат:
 * 1*6
 * 2*3
 * 3*2
 * 6*1
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите положительное целое число");
        int value = new Scanner(System.in).nextInt();
        System.out.println("Произведение пар множителей введённого числа:");
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                for (int j = value; j >= 1; j--) {
                    if (j * i == value) {
                        System.out.println(i + " * " + j + " = " + i * j);
                    }
                }
            }
        }
    }
}