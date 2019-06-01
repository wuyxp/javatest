/*
储物柜难题
    一个学校有100个储物柜和100个学生，所有的储物柜在上学的第一天都是关着的
    随着学生进来，
    第一个学生把所有的储物柜全部打开
    第二个学生从第二个柜子开始每隔一个柜子就进行处理
    第三个学生从第三个柜子开始每隔两个柜子就进行处理
    ....
    处理是指（如果关闭就打开，如果打开就关闭）
那么等着100个学生都走完了，柜子的状态是啥样的
 */
package basics.unit7_8;

import java.util.Arrays;

public class StoreContentArk {
    public static void main(String[] args){
        final int storeCount = 100;
        final int students = 100;
        char[] store = new char[storeCount];
        Arrays.fill(store, '开');
        for(int i =1;i<students;i++){
            for(int si = (i);si<storeCount;si++){
                if(si % (i) == 0){
                    if(store[si] == '关'){
                        store[si] = '开';
                    }else{
                        store[si] = '关';
                    }
                }
            }
        }
        System.out.println(Arrays.toString(store));
    }
}
