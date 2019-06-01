package basics.unit11;

/*
动态绑定
 */
public class DynamicBindingDemo {
    public static void main(String[] args) {

        m(new GraduateStudent());
        m(new Student());
        m(new DynamicPerson());
        m(new Object());
    }

    public static void m(Object o) {
        System.out.println(o);
    }

}

class GraduateStudent extends Student {

}

class Student extends DynamicPerson {

    @Override
    public String toString() {
        return "Student";
    }
}

class DynamicPerson extends Object {

    @Override
    public String toString() {
        return "Person";
    }
}
