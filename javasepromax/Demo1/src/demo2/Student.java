package demo2;

public class Student extends Person implements Display{
    private String id;


    public Student() {
    }

    public Student(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void printInfo() {
        System.out.println("----学号：" + this.id + "----姓名：" + getName() + "----年龄：" + getAge() + "----性别：" + getGender());
    }
}
