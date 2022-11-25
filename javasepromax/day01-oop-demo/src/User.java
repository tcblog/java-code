public class User {
    /**
     *static修饰的成员变量  只在内存中有一份
     */
    public static int onlineNumber= 161;

    /**
     * 实例成员变量：无static修饰，属于每个对象的，必须用对象名.访问
     */
    public String name;
    public int age;
}
