package sjx;

public class Triangle {
    static int count=0;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        count++;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        count++;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double riangle(){

        double p = (this.sideA+ this.sideB + this.sideC)/2.0f;

        if (this.sideA + this.sideB > this.sideC && this.sideA + this.sideC > this.sideB && this.sideB + this.sideC > this.sideA){
            double s = Math.sqrt(p*(p-this.sideA)*(p-this.sideB)*(p-this.sideC));
            return s;
        }
        System.out.println("不能构成三角形");
        return 0;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
