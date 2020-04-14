import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixColumnSelectionSort {
    public static void main(String[] args) throws IOException {

        int minpos = 0;
        int _temp = 0;

        System.out.println("This program sorts matrix filled randomly, by columns");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input matrix lines number: ");

        int n = Integer.parseInt(reader.readLine());

        System.out.print("Input matrix columns number: ");

        int m = Integer.parseInt(reader.readLine());

        int[][] matrix = new int[n][m];

        System.out.println("Unsorted matrix:");
        //Filling array and printing unsorted
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20);
                System.out.print(matrix[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        //Iterating matrix strings and sorting them with selection sort
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                minpos = i;
                for (int k = i + 1; k < matrix.length; k++) {
                    if (matrix[k][j] <= matrix[minpos][j]) {
                        minpos = k;
                    }
                }
                _temp = matrix[minpos][j];
                matrix[minpos][j] = matrix[i][j];
                matrix[i][j] = _temp;
            }
        }
        //Printing sorted matrix
        System.out.println("Sorted matrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }

}

