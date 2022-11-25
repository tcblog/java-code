package demo;

public class Student extends Person implements Display{
    private String id;

    public Student() {
    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String name, int age, String gender, String id) {
        super(name, age, gender);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void printInfo() {
        System.out.println("-----学号：" + this.id + "----姓名:" + super.getName() + "----年龄："+  super.getAge() + "----性别：" + super.getGender() + "----" );
    }
}
