/** Напишите программу-игру, в которой пользователь будет угадывать некое число,
 * а программа, если он не угадал, будет сообщать ему, больше или меньше
 * введённое им число, чем загаданное. */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        System.out.println("Программа загадала целое число от 0 до 100. Угадайте его!");

        while (true) {
            int attempt = new Scanner(System.in).nextInt();
            if (attempt > value){
                System.out.println("Загаданное число меньше");
            } else if (attempt < value) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Вы угадали!");
                break;
            }
        }
    }
}