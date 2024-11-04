import java.util.Scanner;

public class WhilePinCode {
    public static void main(String[] args) {
        int secretPinCode = 5396;
        int pinCode = -1;

        while (pinCode != secretPinCode) {
            if (pinCode == -1) { // это небольшой баг
                System.out.println("Input PIN-code: ");
            } else {
                System.out.println("Incorrect PIN-code. Input PIN-code: ");
            }
            pinCode = new Scanner(System.in).nextInt();
        }

        System.out.println("Correct PIN-code! You are cool hacker!!");
    }
}
