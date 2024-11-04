import java.util.Scanner;

public class HW_While {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("Вводите положительные числа и жмите <Enter>:");
        while (true) {
            int value = new Scanner(System.in).nextInt();
            if (value > 0) {
                sum = sum + value;
                System.out.println("Сумма = " + sum +
                        ". Введите ещё одно число или 0 для сброса суммы:");
            }
            if (value == 0) {
                sum = 0;
                System.out.println("Сумма сброшена. Введите число: ");
            }
        }
    }
}
