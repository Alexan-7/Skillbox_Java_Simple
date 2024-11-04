public class Main1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int coffeeAmount = 2330;
        int milkAmount = 3210;

        int cappucinoMilkRequired = 60; // Required - необходимый
        int cappucinoCoffeeRequired = 15;

        if (coffeeAmount >= cappucinoCoffeeRequired &&
        milkAmount >= cappucinoCoffeeRequired) {
            System.out.println("Готовим капучино");
        } else {
            System.out.println("Ингредиентов недостаточно :(");
        }
    }
}