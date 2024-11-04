public class TernarOperator3 {
    public static void main(String[] args) {
        boolean passIsValid = true;
        boolean inCarantine = true;

        boolean isPesonnel = true;

        // тер. опер-р внутри тер. опер-ра - СЛОЖНО, НЕ НАДО!
        String message = passIsValid && !inCarantine ?
                "Проход открыт" :
                (isPesonnel ? "Проход открыт только для персонала" : "Проход закрыт");
        System.out.println(message);
    }
}