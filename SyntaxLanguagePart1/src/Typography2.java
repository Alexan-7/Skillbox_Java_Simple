public class Typography2 {
    public static void main(String[] args) {
        // типография
        int paperReserve = 600000;
        int inkReserve = 600000; // чернила = кол-во листов
        int coverReserve = 2000;

        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

        // надо напечатать книгу
        int pagesInBook = 530;
        int booksCount = 2000;

        boolean coldPrintingMode = false;
        double printRollerTemp = 200;

        int papersCount = booksCount * pagesInBook / 2; // делим на два, чтобы получить количество листов
        boolean paperIsEnought = paperReserve >= papersCount;
        boolean inkIsEnought = inkReserve >= papersCount + booksCount;
        boolean coversAreEnought = coverReserve >= booksCount;
        boolean rollerTempIsNormal = printRollerTemp > printRollerMinTemp && printRollerTemp < printRollerMaxTemp;

        if (paperIsEnought && inkIsEnought && coversAreEnought && rollerTempIsNormal || coldPrintingMode) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }
    }
}