package unit10;
/*
测试栈类
 */

public class TestStachOfIntegers {
    public static void main(String[] args) {
        StachOfIntegers stack = new StachOfIntegers();
        for (int i = 0; i < 18; i++) {
            stack.push(i);
        }
        while (!stack.empty()) {
            System.out.print("  " + stack.pop());
        }
    }
}
