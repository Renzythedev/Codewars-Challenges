package challenge36;

public final class Spiral {
    public static int[][] generateSpiralMatrix(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i<size; i++) {

            for (int j = 0; j<size; j++) {
                matrix[i][j] = 0;
            }
        }

        int row = 0;
        int rowMax = size -1 ;
        int colMax= size - 1;
        int col = 0;
        while (row <= rowMax && col <= colMax) {
            for (int i = (col > 1) ? col -1 : 0; i<= colMax; i++) {
                matrix[row][i] = 1;
            }
            row++;

            for (int i = row; i<=rowMax; i++) {
                matrix[i][colMax] = 1;
            }
            colMax--;

            for (int i = colMax; i >= col; i--){
                matrix[rowMax][i] = 1;
            }
            rowMax--;

            for (int i = rowMax; i > row; i--) {
                matrix[i][col] = 1;
            }
            row++;
            col+=2;
            colMax--;
            rowMax--;
        }
        return matrix;
    }


    public static void main(String[] args) {
        int size = 5;
        int[][] result = generateSpiralMatrix(size);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(result[i][j] == 1 ? "0" : ".");
            }
            System.out.println();
        }
    }
}
