package module2.baitap.ss5_access_modifier.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {

    }

    Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 3.14 * (getRadius() * getRadius());
    }
}
