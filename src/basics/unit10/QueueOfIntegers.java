package basics.unit10;

/*
先进先出的整数队列

 */
public class QueueOfIntegers {
    private int[] element;
    private int size;

    QueueOfIntegers(int size) {
        this.size = size;
        this.element = new int[size];
    }

    QueueOfIntegers() {
        this(16);
    }

    void push(int value) {
        if (this.size >= this.element.length) {
            int[] newArr = new int[this.element.length * 2];
            System.arraycopy(this.element, 0, newArr, 0, this.element.length);
        }
        this.element[this.size++] = value;
    }

    boolean empty() {
        return this.size == 0;
    }

    int pop() {
        int result = this.element[0];
        for (int i = 0; i < this.size - 1; i++) {
            this.element[i] = this.element[i + 1];
        }
        return result;
    }

    int peek() {
        return this.element[0];
    }

    int getSize() {
        return this.size;
    }
}
