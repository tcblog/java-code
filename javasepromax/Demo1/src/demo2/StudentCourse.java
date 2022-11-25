package demo2;

public class StudentCourse implements Display{
    private Student student;
    private Course course;


    public StudentCourse() {
    }

    public StudentCourse(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public void printInfo() {

    }
}
