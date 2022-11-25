package demo1;

public class Student extends Person implements Perform{

    private String studentNumber;


    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Student(String name, int age, String studentNumber) {
        super(name, age);
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String reward() {
        return "优秀学生干部";
    };

    @Override
    public String punish() {
        return "记过处分";
    };

    @Override
    public void display() {
        System.out.println("姓名：" + getName() + "\t年龄:" + getAge() + "\t学号：" + getStudentNumber());
    }
}
