public class Main7 {
    public static void main(String[] args) {
        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 3222; // обезжиренное молоко

        boolean isBlocked = true;

        int cappucinoMilkRequired = 60; // Required - необходимый
        int cappucinoCoffeeRequired = 15;

        boolean milkIsEnought = skimmedMilkAmount >= cappucinoMilkRequired ||
                milkAmount >= cappucinoMilkRequired;

        boolean coffeeIsEnought = coffeeAmount >= cappucinoCoffeeRequired;

        boolean hasErrors = false; // чтобы снизить вложенность и получить список всех ошибок

        if (isBlocked) {
            System.out.println("Кофе-машина заблокирована");
            hasErrors = true;
        }

        if (!coffeeIsEnought) {
            System.out.println("Кофе недостаточно");
            hasErrors = true;

        }

        if (!milkIsEnought) {
            System.out.println("Молока недостаточно");
            hasErrors = true;
        }

        if (!hasErrors) {
            System.out.println("Готовим кофе");
        }
    }
}