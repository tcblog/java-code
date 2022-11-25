package Demo1;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public float distance(int valueX, int valueY) {
        float sqrt = (float) Math.sqrt(Math.pow((valueX - this.x), 2) + Math.pow((valueY - this.y), 2));

        return sqrt;
    }

    public float distance(int x1, int x2, int y1, int y2) {
        float sqrt = (float) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        return sqrt;
    }

    public float distance(Point p) {

        float sqrt = (float) Math.sqrt(Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2));

        return sqrt;

    }


}
