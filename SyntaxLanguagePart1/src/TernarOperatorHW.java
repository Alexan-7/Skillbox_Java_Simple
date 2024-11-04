public class TernarOperatorHW {
    public static void main(String[] args) {

        boolean errors = true;

        //TODO: check another types of prints
        String message = errors ? "Печать запрещена" : "Печать разрешена";
        System.out.println(message);

/*
        if (!errors) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }
*/
    }
}
