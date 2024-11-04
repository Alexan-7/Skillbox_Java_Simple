public class Main3 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmiunt = 1290; // обезжиренное молоко

        boolean isBlocked = true;

        int cappucinoMilkRequired = 60; // Required - необходимый
        int cappucinoCoffeeRequired = 15;

        if (!isBlocked && milkAmount >= cappucinoMilkRequired &&
            coffeeAmount >= cappucinoCoffeeRequired) { // !!isBlocked - двойное отрицание
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Anything error :^(!");
        }
    }
}