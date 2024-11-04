public class Main {
    public static void main(String[] args) {
//        int i = 0;
//        while (i < 20) {
//            if (i > 6 && i < 10) { // за исключением значений от 7 до 9
//                continue;
//            }
//
//            System.out.println(i + " YES");
//            i = i + 1;
//        }
        for (int i = 0; i < 10; ) {
            if (i < 5) {
                i = i + 1;
            }
            i = i + 1;
            System.out.println(i + " YES");
        }
    }
}