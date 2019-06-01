package basics.unit11;

/*
构造方法链
 */
public class Faculty extends Employee {
    public static void main(String[] args) {
        new Faculty();
    }

    public Faculty() {
        System.out.println("444444444444");
    }

}

class Employee extends Person {
    public Employee(String s) {
        System.out.println(s);
    }

    public Employee() {
        this("222222222");
        System.out.println("3333333333");
    }
}

class Person {
    public Person() {
        System.out.println("11111111");
    }
}