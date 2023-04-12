package module2.baitap.ss6_ke_thua.lop_point_va_moveablepoint;

public class Point {
    float x = 0.0f;
    float y = 0.0f;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float newX, float newY) {
        this.x = newX;
        this.y = newY;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
