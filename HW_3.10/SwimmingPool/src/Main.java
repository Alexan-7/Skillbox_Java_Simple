/**
 * Напишите программу с использованием цикла while,
 * которая рассчитает и выведет в консоль время наполнения
 * бассейна с учётом скоростей наполнения и опустошения.
 */

public class Main {
    public static void main(String[] args) {
        int volume = 1200; // объем бассейна
        int fillingSpeed = 30; // скорость наполнения бассейна
        int devastationSpeed = 10; // скорость опустошения бассейна
        int filledPool = 0;
        int countMin = 0;

        while (filledPool <= volume) {
            filledPool = filledPool + fillingSpeed - devastationSpeed;
            countMin += 1;
            if (filledPool == volume) {
                break;
            }
            // System.out.println(filledPool + " - " + countMin);
        }
        System.out.println("Время наполнения бассейна " + countMin + " мин.");
    }
}