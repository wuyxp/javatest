package basics.unit13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/*
根据Number父类，来求出一个ArrayList中的最大值
 */
public class LargestNumbers {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList();
        list.add(45);
        list.add(3453.23);
        list.add(new BigInteger("121404492323023423532523"));
        list.add(new BigDecimal("123.14122343523423442343242343"));

        System.out.println("最大的数是：" + getLargestNumber(list));
    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        Number number = null;
        if (list == null || list.size() == 0) {
            return number;
        }
        number = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (number.doubleValue() < list.get(i).doubleValue()) {
                number = list.get(i);
            }
        }
        return number;
    }
}
