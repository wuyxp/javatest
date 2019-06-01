/*
1.生成长度为100的整形数组
2.每一项0-100随机
3.找出最大元素
4.找出第一个最大元素的下标
 */
package basics.unit7_8;

public class MakeArray {
    public static void main(String[] agrs) {
        final int MAX = 100;
        int[] array = new int[MAX];
        String result = "";
        for (int i = 0; i < MAX; i++) {
            array[i] = randomNum(0, 100);
            result = result + " " + array[i];
        }
        System.out.println(result);
//        System.out.println("生成的数组是：" + array);
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < MAX; i++) {
            int tmp = array[i];
            if (max < tmp) {
                max = tmp;
                maxIndex = i;
            }
        }
        System.out.printf("数组的最大数是%d,第一次出现的位置是%d", max, maxIndex);

    }

    private static int randomNum(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }
}
