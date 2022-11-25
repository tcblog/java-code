package Demo1;

public class Test {
    public static void main(String[] args) {
        Point d1 = new Point();
        float distance = d1.distance(2, 1);
        System.out.println(distance);

        Point d2 = new Point();
        float distance1 = d2.distance(1, 0,2,0);
        System.out.println(distance1);

        Point d3 = new Point(1,2);
        Point d4 =new Point();
        float distance2 = d4.distance(d3);
        System.out.println(distance2);

    }
}
