package demo;

public class Test {
    public static void main(String[] args) {
        Course c1 = new Course("java程序设计","IOT001",6);
        //c1.printInfo();
        Course c2 = new Course("Android程序设计","IOT002",8);
        //c2.printInfo();
        Course c3 = new Course("python程序设计","IOT003",4);
        //c3.printInfo();

        Student s1 = new Student("郭靖",19,"男","216550801");
        //s1.printInfo();
        Student s2 = new Student("黄蓉",17,"女","216550802");
        //s2.printInfo();
        Student s3 = new Student("杨康",19,"男","216550803");
        //s3.printInfo();


        StudentCourse sc1 = new StudentCourse(s1,c1,70);
        StudentCourse sc2 = new StudentCourse(s1,c2,45);
        StudentCourse sc3 = new StudentCourse(s1,c3,75);
        StudentCourse sc4 = new StudentCourse(s2,c1,95);
        StudentCourse sc5 = new StudentCourse(s2,c2,90);
        StudentCourse sc6 = new StudentCourse(s3,c2,80);
        StudentCourse sc7 = new StudentCourse(s3,c3,85);
//        sc1.printInfo();
//        sc2.printInfo();
//        sc3.printInfo();
//        sc4.printInfo();
//        sc5.printInfo();
//        sc6.printInfo();
//        sc7.printInfo();

        StudentCourse[] studentCourseArray = {sc1,sc2,sc3,sc4,sc5,sc6,sc7};

        s1.printInfo();
        sc1.printInfo();
        sc2.printInfo();
        sc3.printInfo();



//        int max = 0;
//        StudentCourse courseMaxMsg =  null;
//        for (int i = 0; i < studentCourseArray.length; i++) {
//            if (studentCourseArray[i].getCourse().getCourseId() == "IOT002"){
//                if (studentCourseArray[i].getScore()>max){
//                    max = studentCourseArray[i].getScore();
//                    courseMaxMsg = studentCourseArray[i];
//                }
//            }
//        }
//
//        courseMaxMsg.getStudent().printInfo();
//        courseMaxMsg.printInfo();

        int max = 0;
        StudentCourse courseMaxMsg =  null;
        for (StudentCourse temp : studentCourseArray){
            if (temp.getCourse().getCourseId() == "IOT002"){
                if (temp.getScore()>max){
                    max = temp.getScore();
                    courseMaxMsg = temp;
                }
            }
        }
        courseMaxMsg.getStudent().printInfo();
        courseMaxMsg.printInfo();



        int sumCredit = 0;
        for (StudentCourse temp : studentCourseArray){
            if (temp.getStudent().getId() == "216550801") {
                if (temp.getScore()>=60){
                    sumCredit += temp.getCourse().getCredit();
                }
            }
        }
        System.out.println(sumCredit);


//        int sumCredit = 0;
//        for (int i = 0; i < studentCourseArray.length; i++) {
//            if (studentCourseArray[i].getStudent().getId() == "216550801") {
//                if (studentCourseArray[i].getScore()>=60){
//                    sumCredit += studentCourseArray[i].getCourse().getCredit();
//                }
//            }
//
//        }
//        System.out.println(sumCredit);


    }
}
