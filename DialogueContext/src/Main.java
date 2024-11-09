import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input your message");
        boolean affairs = false;
        while (true) {
            String input = new Scanner(System.in).nextLine();

            switch (input) {
                case "Hello!":
                    System.out.println("Hello, my friend!");
                    break;
                case "Как дела?":
                    affairs = true;
                    System.out.println("Массаракш!");
                    break;
                case "Это как?":
                    if (affairs) {
                        System.out.println("Массаракш - это ругательство из книги Стругацких.");
                        // affairs = false;
                    } else {
                        System.out.println("Непонятный вопрос.");
                    }
                    break;
                case "У меня также":
                    if (affairs) {
                        System.out.println("Не вешать нос! Всё будет пучком!");
                        affairs = false;
                    }
                    break;
                default:
                    System.out.println("Sorry, I don't understand");
            }
        }
    }
}