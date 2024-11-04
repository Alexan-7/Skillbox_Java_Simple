public class Typography1 {
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
        double printRollerTemp = 50;

        int papersCount = booksCount * pagesInBook / 2; // делим на два, чтобы получить количество листов
        int inkedPapersCount = papersCount + booksCount; // на печать одной обложки тратится столько же чернил, сколько на один лист бумаги
        boolean coverEnought = coverReserve >= booksCount;
        boolean printing = coldPrintingMode || printRollerTemp > printRollerMinTemp && printRollerTemp < printRollerMaxTemp;

        if (paperReserve >= papersCount && inkReserve >= inkedPapersCount && coverEnought && printing) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }
    }
}