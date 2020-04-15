import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MatrixMultiply {
    public static void main(String[] args) throws IOException {

        System.out.println("This program multiplies matrices");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input line number for matrix A: ");

        int n = Integer.parseInt(reader.readLine());

        System.out.print("Input column number for matrix A: ");

        int m = Integer.parseInt(reader.readLine());

        System.out.print("Input column number for matrix B: ");

        int l = Integer.parseInt(reader.readLine());

        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[m][l];
        int[][] matrixC = new int[n][l];

        System.out.println("Randomly filled matrix A: ");

        for(int i = 0; i < matrixA.length; i++){
            for(int j = 0; j < matrixA[i].length; j++){
                matrixA[i][j] = (int) (Math.random() * 10);
                System.out.print(matrixA[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println("Randomly filled matrix B: ");

        for(int i = 0; i < matrixB.length; i++){
            for(int j = 0; j < matrixB[i].length; j++){
                matrixB[i][j] = (int) (Math.random() * 10);
                System.out.print(matrixB[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }



        System.out.println("Matrix C = A * B:");

        int sum = 0;

        for(int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[i].length; j++) {
                for (int k = 0; k < matrixB.length; k++) {
                    sum += matrixA[i][k] * matrixB[k][j];
                }
                matrixC[i][j] = sum;
                sum = 0;
                System.out.print(matrixC[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
