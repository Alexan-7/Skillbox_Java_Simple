public class Main {
    public static void main(String[] args) {
        int vasyaAge = 44;
        int katyaAge = 24;
        int mishaAge = 31;

        //TODO: we can delete means of variables
        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
            if (katyaAge >= mishaAge) {
                middle = katyaAge;
                min = mishaAge;
            } else {
                middle = mishaAge;
                min = katyaAge;
            }
        } else if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {
            max = katyaAge;
            if (vasyaAge >= mishaAge) {
                middle = vasyaAge;
                min = mishaAge;
            } else {
                middle = mishaAge;
                min = vasyaAge;
            }
        } else if (vasyaAge >= katyaAge) {
            max = mishaAge;
            middle = vasyaAge;
            min = katyaAge;
        } else {
            max = mishaAge;
            middle = katyaAge;
            min = vasyaAge;
        }
        System.out.println("Minimal age: " + min + "\n" + "Middle age: " + middle
                + "\n" + "Maximal age: " + max);
    }
}