

class Point {
    private int x;
    private int y;
    public int X;
    public int Y;

    public void setX(int x) {
        this.x = (x > 79 ? 79 : (x < 0 ? 0 : x));

    }

    public void setY(int y) {
        this.y = (y > 24 ? 24 : (y < 0 ? 0 : y));
    }

    public void setx(int X) {
        X = (X > 79 ? 79 : (X < 0 ? 0 : X));

    }

    public void sety(int Y) {
        Y = (Y > 24 ? 24 : (Y < 0 ? 0 : Y));
    }

    public int getX() {
        return x;

    }

    public int getY() {
        return y;
    }

    public int getx() {
        return X;

    }

    public int gety() {
        return Y;
    }
}

public class pointdemo {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(22);
        p1.setY(44);
        int a = p1.getX();
        int b = p1.getY();
        System.out.println("The value of x  is : " + a);
        System.out.println("The value of y is " + b);
        int i = p1.getx();
        int j = p1.gety();
        System.out.println("The value of x without using this operator : " + i);
        System.out.println("The value of y without using this operaator : " + j);
    }
}
