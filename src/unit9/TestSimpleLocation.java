package unit9;

/*
测试获取最大表格的矩阵
 */
public class TestSimpleLocation {
    public static void main(String[] args){
        final int ROW = 3;
        final int COL = 2;
        Location location1 = new Location();
        Location location2 = new Location(ROW, COL);


        for(int i =0;i< 3;i++){
            double[] rows = new double[4];
            for(int j=0;j<4;j++){
               rows[j] = (double) (Math.random() * 100);
            }
            location1.setRow(i, rows);
        }
        location1.printMatrix();
        double[] maxValue1 = location1.getMaxValues();
        System.out.printf("矩阵的最大值是%f，其位置是（%d，%d）", maxValue1[0], (int) maxValue1[1], (int) maxValue1[2]);

        System.out.println("\n*******\n");



        for(int i =0;i< ROW;i++){
            double[] rows = new double[COL];
            for(int j=0;j<COL;j++){
                rows[j] = (double) (Math.random() * 100);
            }
            location2.setRow(i, rows);
        }
        location2.printMatrix();
        double[] maxValue = location2.getMaxValues();
        System.out.printf("矩阵的最大值是%f，其位置是（%d，%d）", maxValue[0], (int) maxValue[1], (int) maxValue[2]);

    }
}
