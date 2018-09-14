package unit11;

import java.util.ArrayList;
import java.util.Collection;

/*
为现有的arrayList增加新的功能
1. 去重
2. 排序
 */
public class MyArrayList extends ArrayList {

    MyArrayList(){
        super();
    }
    MyArrayList(Collection collection){
        super(collection);
    }
    MyArrayList(int length){
        super(length);
    }

    ArrayList clearRepeat() {
        ArrayList result = new ArrayList();
        for (int i = 0; i < this.size(); i++) {
            Object o = this.get(i);
            result.add(o);
            if (this.indexOf(o) != this.lastIndexOf(o) && result.indexOf(o) != result.lastIndexOf(o) ) {
                result.remove(o);
            }
        }
        return result;
    }

    ArrayList sort() {
        return quickSort(this);
    }

    private ArrayList quickSort(ArrayList list) {
        if (list.size() <= 1) {
            return list;
        }
        int BaseIndex = (int) list.get(0);
        ArrayList leftArr = new ArrayList();
        ArrayList rightArr = new ArrayList();

        for (int i = 1; i < list.size(); i++) {
            Object o = list.get(i);
            if ((int) o < BaseIndex) {
                leftArr.add(o);
            } else {
                rightArr.add(o);
            }
        }
        ArrayList result = new ArrayList();
        result.addAll(quickSort(leftArr));
        result.add(list.get(0));
        result.addAll(quickSort(rightArr));

        return result;
    }
}
