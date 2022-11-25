package chw;



public class Test {
    public static void main(String[] args) {
        Course c1 = new Course("java程序设计","IOT001",6);
        Course c2 = new Course("Android程序设计","IOT002",8);
        Course c3 = new Course("python程序设计","IOT003",4);

        Student s1 = new Student("陈浩伟",19,"男","216550212");
        Student s2 = new Student("黄蓉",17,"女","216550802");
        Student s3 = new Student("杨康",19,"男","216550803");

        StudentCourse sc1 = new StudentCourse(s1,c1,70);
        StudentCourse sc2 = new StudentCourse(s1,c2,45);
        StudentCourse sc3 = new StudentCourse(s1,c3,75);
        StudentCourse sc4 = new StudentCourse(s2,c1,95);
        StudentCourse sc5 = new StudentCourse(s2,c2,90);
        StudentCourse sc6 = new StudentCourse(s3,c2,80);
        StudentCourse sc7 = new StudentCourse(s3,c3,85);

        StudentCourse studentCourse[] = {sc1,sc2,sc3,sc4,sc5,sc6,sc7};

        s1.printInfo();
        sc1.printInfo();

        StudentCourse studentCourseMsg = null;
        int max = 0;
        for (StudentCourse temp : studentCourse) {
            if (temp.getCourse().getCourseId() == "IOT002"){
                if (temp.getScore() > max){
                    max = temp.getScore();
                    studentCourseMsg = temp;
                }
            }
        }
        studentCourseMsg.printInfo();

//        Count count = new Count();
        System.out.println(Count.num);

    }
}
