package sjx;

public class Area {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3,4,5);
        if (triangle1.riangle() != 0.0){
            System.out.println("第" + Triangle.count + "个三角形面积为" + triangle1.riangle());
        }

        System.out.println("---------------------------");

        Triangle triangle2 = new Triangle(1,2,3);
        if (triangle2.riangle() != 0.0){
            System.out.println("第" + Triangle.count + "个三角形面积为" + triangle1.riangle());
        }


        System.out.println("---------------------------");

        Triangle triangle3 = new Triangle();
        triangle3.setSideA(7);
        triangle3.setSideB(8);
        triangle3.setSideC(9);
        if (triangle3.riangle() != 0.0){
            System.out.println("第" + Triangle.count + "个三角形面积为" + triangle3.riangle());
        }

    }

}
