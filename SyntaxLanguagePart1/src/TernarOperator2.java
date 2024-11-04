public class TernarOperator2 {
    public static void main(String[] args) {
        boolean passIsValid = true;
        boolean inCarantine = true;

        boolean isPesonnel = true;

        String message;

        if (passIsValid && !inCarantine) {
            message = "Проход открыт";
        } else if (isPesonnel) {
            message = "Проход открыт только для персонала";
        } else {
            message = "Проход закрыт";
        }
        System.out.println(message);
    }
}
/*  // тер. опер-р внутри тер. опер-ра - СЛОЖНО, НЕ НАДО!
        String message = passIsValid && !inCarantine ?
                "Проход открыт" :
                (isPesonnel ? "Проход открыт только для персонала" : "Проход закрыт");
    }
*/


