package basics.unit10;
/*
先进后出的整数栈

 */

public class StachOfIntegers {
    private int[] element;
    private int size;

    StachOfIntegers(int size) {
        this.element = new int[size];
        this.size = 0;
    }

    StachOfIntegers() {
        this(16);
    }

    boolean empty() {
        return this.size == 0;
    }

    int peek() {
        return this.element[this.size - 1];
    }

    void push(int value) {
        if (this.size >= this.element.length) {
            int[] tmpArr = new int[this.element.length * 2];
            System.arraycopy(this.element, 0, tmpArr, 0, this.element.length);
            this.element = tmpArr;
        }
        this.element[size++] = value;
    }

    int pop() {
        return this.element[--size];
    }

    int getSize() {
        return this.size;
    }
}
