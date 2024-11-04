public class Main {
    public static void main(String[] args) {
        int sougtYear = 1985;

        int firstYear = 1922;
        int lastYear = 2022;

        boolean yearExist = false;

        for (int year = firstYear; year <= lastYear; year++) {
            System.out.println(year);
            if (year == sougtYear) {
                yearExist = true;
                break;
            }
        }

        String found = "Год найден";
        String notFound = "Год не найден";
        System.out.println(yearExist ? found : notFound);
    }
}