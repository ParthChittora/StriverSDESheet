public class SetMatrixZeroes {
    public static void setRowZero(int[][] matrix, int row) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
    }

    public static void setColZero(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
    public static void printMatrix(int[][] matrix){
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix) {
        boolean firstRowEqualZero = false, firstColEqualZero = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;// setting the first element of the col as 0
                    matrix[i][0] = 0;// setting first el of row as zero
                    if (i == 0) firstRowEqualZero = true;
                    if (j == 0) firstColEqualZero = true;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                setRowZero(matrix, i);
            }
        }
        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                setColZero(matrix, i);
            }
        }
        if(firstRowEqualZero){
            for (int i = 1; i < matrix[0].length ; i++) {
                matrix[0][i]=0;
            }
        }if(firstColEqualZero){
            for (int i = 1; i < matrix.length ; i++) {
                matrix[i][0]=0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        printMatrix(matrix);
        setZeroes(matrix);
        printMatrix(matrix);
    }
}
