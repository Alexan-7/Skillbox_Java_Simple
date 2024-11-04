public class Main5 {
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

//        if (!isBlocked) { // изначально-то он true. Никем не задается и не меняется
        if (!isBlocked && coffeeIsEnought && milkIsEnought) { // !!isBlocked - двойное отрицание
            // сначала выполнится оператор И &&, потом оператор ИЛИ ||
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Что-то пошло не так :^(!");
        }
    }
}