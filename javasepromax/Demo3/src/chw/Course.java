package chw;

public class Course implements Display{
    private String courseName;
    private String courseId;
    private int credit;

    public Course() {
    }

    public Course(String courseName, String courseId, int credit) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.credit = credit;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public void printInfo() {
        System.out.println("------课程代码：" + this.courseId + "------课程名称：" + this.courseName + "------课程学分：" + this.credit +"------");
    }
}
