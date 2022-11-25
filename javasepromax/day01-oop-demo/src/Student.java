public class Student {
    // 属于对象
    private String name;

    /**
     * 静态成员方法,有static修饰，归属于类，可以被共享访问，用类名或对象名都可以调用
     */
    public static int getMax(int age1,int age2){
        return age1 > age2 ? age1 :age2;
    }

    /**
     * 实例方法 属于对象的,只能用对象触发访问
     * @param
     */
    public void study(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println(Student.getMax(10,32));

        // 同一个类中，访问静态方法，类名可以不写
        System.out.println(getMax(20,30));

        // 对象.实例方法
        Student s = new Student();
        s.name = "猪八戒";
        s.study();
    }
}
