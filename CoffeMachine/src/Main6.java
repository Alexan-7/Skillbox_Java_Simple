public class Main6 {
    public static void main(String[] args) {
        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1; // обезжиренное молоко

        boolean isBlocked = true;

        int cappucinoMilkRequired = 60; // Required - необходимый
        int cappucinoCoffeeRequired = 15;

//        if (!isBlocked) { // изначально-то он true. Никем не задается и не меняется
        if (!isBlocked && coffeeAmount >= cappucinoCoffeeRequired &&
                skimmedMilkAmount >= cappucinoMilkRequired ||
                milkAmount >= cappucinoMilkRequired) { // !!isBlocked - двойное отрицание
            // сначала выполнится оператор И &&, потом оператор ИЛИ ||
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Что-то пошло не так :^(!");
        }
    }
}