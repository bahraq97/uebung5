import java.lang.Math;

import static java.lang.Math.*;


public class Point {

    private int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double distance() {
        return sqrt((x) ^ (2) + (y) ^ (2));
    }

    public double distance(Point p) {
        return sqrt((p.x - x) ^ (2) + (p.y - y) ^ (2));
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
