package basics.sudoku.model;

public class Sudoku {
    private final static int LENGTH = 9;
    private int[][] matrix = new int[LENGTH][LENGTH];

    public Sudoku() {

    }

    // 生成矩阵，当有参数时：则输入测试矩阵
    public int[][] generatorMatrix() {
        while (!Util.isDoneMatrix(this.matrix)) {
            matrix = new int[LENGTH][LENGTH];
            for (int i = 0; i < LENGTH; i++) {
                this.generator(i + 1, 0);
            }
        }
        return this.getMatrix();
    }

    public int[][] generatorMatrix(String s) {
        if (s.equalsIgnoreCase("test")) {
            int[][] testMatrix = new int[LENGTH][LENGTH];
            for (int i = 0; i < LENGTH; i++) {
                for (int j = 0; j < LENGTH; j++) {
                    testMatrix[i][j] = i + j;
                }
            }
            return testMatrix;
        }
        return generatorMatrix();
    }

    int[][] getMatrix() {
        return matrix;
    }

    private boolean generator(int value, int rowIndex) {
        if (rowIndex >= LENGTH) return true;
        // 没有完成生成操作
        int[] arrRow = Util.shuffle(Util.generatorRow());
        for (int i = 0; i < LENGTH; i++) {
            int colIndex = arrRow[i];
            if (!Util.checkMatrix(this.matrix, rowIndex, colIndex, value)) {
                continue;
            }
            this.matrix[rowIndex][colIndex] = value;
            if (!this.generator(value, rowIndex + 1)) {
                this.matrix[rowIndex][colIndex] = 0;
            }
            return true;
        }
        return false;
    }

}
