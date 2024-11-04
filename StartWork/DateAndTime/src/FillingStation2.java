public class FillingStation2 {
    public static void main(String[] args) {
        // ДОБАВИМ "СИНТАКСИЧЕСКОГО САХАРА" VAR
        System.out.println("Система расчёта стоимости топлива");

        var fuelType = 92; // тип бензина
        int amount = 50;

        var hasDiscount = amount > 10;

        double fuel92price = 60.2;
        var fuel95price = 67.33;

        double discount = 0.1;
        String wrongFuelTypeMessage = "Указан неверный тип топлива.";

        double fuelPrice = 0;
        if (fuelType == 92) {
            fuelPrice = fuel92price;
        } else if (fuelType == 95) {
            fuelPrice = fuel95price;
        } else {
            System.out.println(wrongFuelTypeMessage);
        }

        if (hasDiscount) {
            fuelPrice = (1 - discount) * fuelPrice;
        }

        if (amount < 1) {
            System.out.println("Указано слишком малое количество топлива");
            amount = 0;
        }

        String fuelPriceMessage = "Цена выбранного топлива: " + fuelPrice + " ₽";
        System.out.println(fuelPriceMessage);

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " ₽");
    }
}