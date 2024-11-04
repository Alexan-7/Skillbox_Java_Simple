public class Main {
    public static void main(String[] args) {
/*        for (int i = 15; i <= 40; i++) {
            System.out.println(i);
            if (i == 16) {
                System.out.println("Вы можете начинать обучаться вождению");
            }
            if (i == 18) {
                System.out.println("Вы можете получить водительские права");
            }
            if (i == 35) {
                System.out.println("Вы можете баллотироваться на пост президента");
            }
        }
        for (int i = 50; i > 0; i--) {
            System.out.println(i);
        }
*/
//        for (int i = 2; i < 100; i = i + 2) {
//            System.out.println(i);
//        }
        int a = 0;
//        for (; a < 100; a = a + 3) {
//            System.out.println(a);
//        }
//        for (; ; a = a + 2) {
//            System.out.println(a);
//        }
        for (; a < 100; ) { // никогда не увеличится
            System.out.println(a);
        }
    }
}