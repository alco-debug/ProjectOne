public class Main {
    public static void main(String[] args) {
        double a, b, c, d;
        a = 1;
        b = 4;
        c = 4;
        d = b * b - 4 * a * c;
        if (d > 0) {
            System.out.println("У уравнения 2 корня");
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }
        if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("У уравнения 1 корень");
            System.out.println(x);
        }
        if (d < 0) {
            System.out.println("Уравнение не имеет корней");
        }
    }
}
