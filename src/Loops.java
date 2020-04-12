public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        int i = 0;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println();

        while (i > 0) {
            i--;
            System.out.println(i);
        }
        System.out.println();

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        System.out.println();

        do {
            i--;
            System.out.println(i);
        } while (i > 0);
    }
}
