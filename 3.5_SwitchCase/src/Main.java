import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Input your message");
            String input = new Scanner(System.in).nextLine();

            // Слово "equals" означает метод сравнения двух строк
//            if (input.equals("Hello!")) {
//                System.out.println("Hello, my friend!");
//            } else if (input.equals("How are you?")) {
//                System.out.println("I'm fine, thanks! And you?");
//            } else {
//                System.out.println("Sorry, I don't understand");
//            }

//            switch (input) {
//                case "Hello!":
//                    System.out.println("Hello, my friend!");
//                    break;
//                case "How are you?":
//                    System.out.println("I'm fine, thanks! And you?");
//                    break; // обязательно break, иначе будут проверяться все кейсы
//                case "How old are you?":
//                    System.out.println("I am eleven years old");
//                    break;
//                case "Qq":
//                    System.out.println("Q-ka-re-q!");
//                    break;
//                default:
//                    System.out.println("Sorry, I don't understand");

            // без break (короче) с 14-й версии
            switch (input) {
                case "Hello!" -> System.out.println("Hello, my friend!");
                case "How are you?" -> {
                    System.out.println("I'm fine, thanks!");
                    System.out.println("And you?");
                }
                case "How old are you?" -> System.out.println("I am eleven years old");
                case "Qq" -> System.out.println("Q-ka-re-q!");
                case "Где купить смарфон?" -> System.out.println("На базаре");
                default -> System.out.println("Sorry, I don't understand");
            }
        }
    }
}