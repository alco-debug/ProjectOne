public class MaxMin {
    public static void main(String[] args) {
        double[] arr = new double[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 69;
            System.out.println(arr[i]);
        }

        double curmax = arr[0];
        double curmin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > curmax) {
                curmax = arr[i];
            }

            if (arr[i] < curmin) {
                curmin = arr[i];
            }
        }

        System.out.println();

        System.out.println("Наименьшее значение в массиве равно");
        System.out.println(curmin);

        System.out.println();

        System.out.println("Наиольшее значение в массиве равно");
        System.out.println(curmax);
    }
}
