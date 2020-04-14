public class MatrixColumnSelectionSort {
    public static void main(String[] args) {

        int[][] matrix = new int[25][25];
        int minpos = 0;
        int _temp = 0;

        System.out.println("Unsorted matrix:");
        //Filling array and printing unsorted
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
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

