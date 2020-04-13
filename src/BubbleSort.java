public class BubbleSort {
    public static void main(String[] args) {

        double[] arr = new double[10];
        double temp;

        System.out.println("Unsorted array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 10;
            System.out.println(arr[i]);
        }

        System.out.println();

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array");

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
