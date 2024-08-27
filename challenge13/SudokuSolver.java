package challenge13;

public final class SudokuSolver {

    private final int[][] sudoku;

    public SudokuSolver(int[][] sudoku) {
        if (sudoku.length == 9) {
            for (int i = 0; i<sudoku.length; i++) {
                if (sudoku[i].length==9) {
                    continue;
                }else {
                    throw new RuntimeException("Each row must contain exactly 9 elements.");
                }
            }
        }else {
            throw new RuntimeException("The Sudoku grid must be 9x9 in size.");
        }
        this.sudoku = sudoku;
    }

    public boolean solve() {
        for(int row = 0; row < sudoku.length; row++) {

            for (int col = 0; col < sudoku[row].length; col++) {

                if (sudoku[row][col]==0){

                    for (int i = 1; i<=9; i++) {

                        if (isValid(row,col,i)) {

                            sudoku[row][col] = i;

                            if (solve())
                                return true;

                            sudoku[row][col] = 0;
                        }
                    }

                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(int row, int col, int num) {
        for (int i = 0; i<9; i++) {
            if(sudoku[row][i]==num)
                return false;
        }

        for (int i = 0; i<9; i++) {
            if (sudoku[i][col]==num)
                return false;
        }
        return true;
    }

    public void print() {
        for (int i = 0; i<sudoku.length; i++) {

            for (int j = 0; j < sudoku[i].length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }


    }
}
