public class Main2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmiunt = 1290; // обезжиренное молоко

        int cappucinoMilkRequired = 60; // Required - необходимый
        int cappucinoCoffeeRequired = 15;

        if (milkAmount >= cappucinoMilkRequired ||
        skimmedMilkAmiunt >= cappucinoMilkRequired) {
            System.out.println("Молока достаточно");
        } else {
            System.out.println("Not enought milk!");
        }
    }
}