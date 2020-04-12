import java.lang.String;

public class SimpleNumber {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100 + 1);

        System.out.println(n);

        boolean simple = true;

        for (int i = 2; i <= (int) (Math.sqrt(n)); i++) {


            if (n % i == 0) {
                simple = false;
                break;
            }
        }

        if (simple) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число не является простым");
        }
    }
}
