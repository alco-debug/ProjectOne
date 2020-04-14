import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixSum {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program sums two randomly generated matrices");

        System.out.print("Input matrix lines number: ");
        int n = Integer.parseInt(reader.readLine());

        System.out.print("Input matrix columns number: ");
        int m = Integer.parseInt(reader.readLine());

        int[][] MatrixA = new int[n][m];
        int[][] MatrixB = new int[n][m];

        // Fill matrices
        for (int i = 0; i < MatrixA.length; i++){
            for (int j = 0; j < MatrixA[i].length; j++){
                MatrixA[i][j] = (int) (Math.random() * 50);
                MatrixB[i][j] = (int) (Math.random() * 50);
            }
        }
        // Output matrices
        System.out.println("Matrix A:\n");
        for (int i = 0; i < MatrixA.length; i++){
            for (int j = 0; j < MatrixA[i].length; j++){
                System.out.print(MatrixA[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println("Matrix B:\n");
        for (int i = 0; i < MatrixB.length; i++){
            for (int j = 0; j < MatrixB[i].length; j++){
                System.out.print(MatrixB[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        // Sum matrices and store result in A
        for (int i = 0; i < MatrixA.length; i++){
            for (int j = 0; j < MatrixA[i].length; j++){
                MatrixA[i][j] += MatrixB[i][j];
            }
        }
        // Output result

        System.out.println("Matrix C = A + B:\n");
        for (int i = 0; i < MatrixA.length; i++){
            for (int j = 0; j < MatrixA[i].length; j++){
                System.out.print(MatrixA[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }



    }
}
