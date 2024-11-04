public class Main4 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmiunt = 1290; // обезжиренное молоко
        int lowLactoseMilkAmount = 1000; // безлактозное молоко

        boolean isBlocked = true;

        int cappucinoMilkRequired = 60; // Required - необходимый
        int cappucinoCoffeeRequired = 15;

        if (skimmedMilkAmiunt >= cappucinoMilkRequired ||
            milkAmount >= cappucinoMilkRequired ||
            lowLactoseMilkAmount >= cappucinoMilkRequired) { // !!isBlocked - двойное отрицание
            System.out.println("There is enought milk");
        } else {
            System.out.println("Not enought milk :^(!");
        }
    }
}