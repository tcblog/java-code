package Demo2;

public class Test {
    public static void main(String[] args) {
        People p1 = new People();
        Student s1 = new Student();
        Teacher t1 = new Teacher();
        p1.talk();
        s1.talk();
        t1.talk();

        Speech.play(s1);
        Speech.play(t1);

        p1 = s1;

        p1.talk();
    }
}
