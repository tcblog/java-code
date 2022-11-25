package app04;

public class Students {
    private String name;
    private int age;

    public void display(){
        int a=1;
        System.out.println(this.name + "is a student");
    }

    public void display(String str){
       System.out.println(str);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
