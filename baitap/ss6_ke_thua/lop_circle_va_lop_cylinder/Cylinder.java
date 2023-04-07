package module2.baitap.ss6_ke_thua.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(String color, int radius, int height) {
        super(color, radius);
        this.height = height;
    }

    public double cylindericalVolume() {
        return (getRadius() * 2) * Math.PI * this.height;
    }

    public String toString() {
        return "Cylinder{" +
                "color='" + super.getColor() + '\'' +
                ", radius=" + super.getRadius() +
                ", height=" + this.height +
                '}';
    }
}

