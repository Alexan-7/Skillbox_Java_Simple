import java.util.Scanner;

public class MainWithScannerAndCase {
    public static void main(String[] args) {
        int milkAmount = 1090; // ml
        int powderAmount = 405; // g
        int eggsCount = 33; // items
        int sugarAmount = 10; // g
        int oilAmount = 30; // ml
        int appleCount = 1; // items

        System.out.println("Что вы хотите приготовить? Введите порядковый номер: " +
                "\n1. Apple juice\n2. Pancakes\n3. Omelette\n4. Apple pie");
        int dish = new Scanner(System.in).nextInt();

        switch (dish) {
            case 1:
                if (appleCount >= 5) {
                    System.out.println("Готовим Apple juice");
                } else {
                    System.out.println("Not enough ingredients");
                }
                break;
            case 2:
                if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
                    System.out.println("Готовим Pancakes");
                } else {
                    System.out.println("Not enough ingredients");
                }
                break;
            case 3:
                if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
                    System.out.println("Готовим Omelette");
                } else {
                    System.out.println("Not enough ingredients");
                }
                break;
            case 4:
                if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
                    System.out.println("Готовим Apple pie");
                } else {
                    System.out.println("Not enough ingredients");
                }
                break;
            default:
                System.out.println("Некорректный ввод. Укажите цифры от 1 до 4");
        }
    }
}