package module2.baitap.ss6_ke_thua.lop_circle_va_lop_cylinder;

public class Circle {
    private String color;
    private double radius;

    public Circle(double radius) {

    }

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
