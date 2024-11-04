import java.util.Scanner;

public class RoadController {
    private static double passengerCarMaxWeight = 3500.0; // kg
    private static int passengerCarMaxHeight = 2000; // mm
    private static int controllerMaxHeight = 4000; // mm

    private static int passengerCarPrice = 100; // RUB
    private static int cargoCarPrice = 250; // RUB
    private static int vehicleAdditionalPrice = 200; // RUB

    public static void main(String[] args) {
        System.out.println("Сколько автомобилей сгенерировать?");

        int carsCount = new Scanner(System.in).nextInt();

        for (int i = 0; i < carsCount; i++) {
            Car car = CarGeneration.getNextCar(); // генерируется новый автомобиль
            System.out.println(car);

            // Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) {
                System.out.println("Шлагбаум открывается... Счастливого пути!");
                continue;
            }

            // Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car); // код со строки 40
            if (price == -1) {
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }
    }

    /**
     * МЕТОД - Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car) {
        int carHeight = car.height;
        int price = 0;
        if (carHeight > controllerMaxHeight) {
            System.out.println("Проезд невозможен: высота вашего " +
                    "ТС превышает высоту пропускного пункта!");
            return -1;
        } else if (carHeight > passengerCarMaxHeight) {
            double weight = car.weight;
            // грузовой автомобиль
            if (weight > passengerCarMaxWeight) {
                price = passengerCarPrice;
                if (car.hasVehicle) {
                    price = price + vehicleAdditionalPrice;
                }
            }
            // Легковой автомобиль
            else {
                price = cargoCarPrice;
            }
        } else {
            price = passengerCarPrice;
        }
        return price;
    }
}