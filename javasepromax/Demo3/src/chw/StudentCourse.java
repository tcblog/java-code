package chw;

public class StudentCourse implements Display{
    private Student student;
    private Course course;
    private int score;

    public StudentCourse() {
    }

    public StudentCourse(Student student, Course course, int score) {
        this.student = student;
        this.course = course;
        this.score = score;
        Count.statistic(this);
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void printInfo() {
        if (this.score >= 60){
            System.out.println("------学号：" + student.getId() + "------姓名：" + student.getName() + "------课程名称：" + course.getCourseName() +"------成绩：" + this.score + "-------获得学分" + course.getCredit() + "-------");
        }
    }
}
