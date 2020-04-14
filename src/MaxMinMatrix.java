import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMinMatrix {
    public static void main(String[] args) throws IOException {

        System.out.println("This program finds min and max value in random matrix");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input matrix lines number: ");

        int n = Integer.parseInt(reader.readLine());

        System.out.print("Input matrix columns number: ");

        int m = Integer.parseInt(reader.readLine());

        int[][] matrix = new int[n][m];
        int curmin, curmax;

        System.out.println("Matrix is:");
        //Filling matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

        curmin = matrix[0][0];
        curmax = matrix[0][0];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] < curmin){
                    curmin = matrix[i][j];
                }
                if(matrix[i][j] > curmax){
                    curmax = matrix[i][j];
                }
            }
        }

        System.out.print("Maximum: ");
        System.out.println(curmax);

        System.out.print("Minimum: ");
        System.out.println(curmin);
    }

}

