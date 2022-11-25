package Demo2;

public class Student extends People{
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
    public void talk() {
        System.out.println("I am taking about my firends,Student");
    }

    public void study(){
        System.out.println("I am stuying now");
    }

}
