public class StaticDemo1 {
    public static void main(String[] args) {
//        静态成员变量
        System.out.println(User.onlineNumber);

//        实例成员变量
        User u = new User();
        u.name = "张三";
        u.age = 18;
        System.out.println(u.name);
        System.out.println(u.age);


    }
}
