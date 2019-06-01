package basics.unit11;

/*
(Person,Student,Employee,Faculty,Staff)类
设计一个名为Person的类和它的两个名为Student和Employee的子类，Employee类又有子类：
教员类Faculty和职员类Staff。
每个人都有姓名，地址，电话号码，电子邮件地址。
学生有班级状态（大一，大二，大三，大四）这些状态定义为常量。
一个雇员涉及办公室，工资，受聘日期。
教员有办公时间和级别，
职员有职务称号
覆盖每个类中的toString方法
，显示响应类别名称和人名。
 */
public class SimplePerson {
}

class SPerson {
    protected String name;
    protected String address;
    protected String num;
    protected String email;

    SPerson(String name, String address, String num, String email) {
        this.name = name;
        this.address = address;
        this.num = num;
        this.email = email;
    }

    SPerson(String name, String num) {
        this(name, "默认地址", num, "test@qq.com");
    }

    SPerson(String name) {
        this(name, "18300000000");
    }

}

class SStudent extends SPerson {
    public SStudent(String name, String address, String num, String email) {
        super(name, address, num, email);
    }

    public SStudent(String name, String num) {
        super(name, num);
    }

    public SStudent(String name) {
        super(name);
    }
}

class SEmployee extends SPerson {
    public SEmployee(String name, String address, String num, String email) {
        super(name, address, num, email);
    }

    public SEmployee(String name, String num) {
        super(name, num);
    }

    public SEmployee(String name) {
        super(name);
    }
}

class SFaculty extends SEmployee {
    public SFaculty(String name, String address, String num, String email) {
        super(name, address, num, email);
    }

    public SFaculty(String name, String num) {
        super(name, num);
    }

    public SFaculty(String name) {
        super(name);
    }
}

class Staff extends SEmployee {
    public Staff(String name, String address, String num, String email) {
        super(name, address, num, email);
    }

    public Staff(String name, String num) {
        super(name, num);
    }

    public Staff(String name) {
        super(name);
    }
}
