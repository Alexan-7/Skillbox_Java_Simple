public class VisokosContin {
    public static void main(String[] args) {
        // вывести все 29-е числа всех месяцев високосных лет
        // високоскн - 29 дней в феврале, НЕвисокосн - 28 дней в феврале

        int firstYear = 1922;
        int lastYear = 2025;

        for (int year = firstYear; year <= lastYear; year++) {
            if (year % 4 != 0) { // здесь НЕ равно-равно, а != - если НЕвисок, то...
                continue; // ...прервать только текущую итерацию цикла и перейти к следующей
            }             // continue - означает, что далнейший код НЕ выполняется

            // снизить уровень вложенности
            System.out.println(year);
            for (int month = 1; month <= 12; month++) {
                String zero = month < 10 ? "0" : "";
                System.out.println("29." + zero + month + "." + year);
            }
        }
    }
}