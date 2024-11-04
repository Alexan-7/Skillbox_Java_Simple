public class TernarOperator1 {
    public static void main(String[] args) {
        boolean passIsValid = true;
        boolean inCarantine = true;

        // тернарный оператор
        String message = passIsValid && !inCarantine ?
                "Проход открыт" : "Проход закрыт";
/*        String message;
        if (passIsValid && !inCarantine) {
            message = "Проход открыт";
        } else {
            message = "Проход закрыт";
        }
 */
    }
}
