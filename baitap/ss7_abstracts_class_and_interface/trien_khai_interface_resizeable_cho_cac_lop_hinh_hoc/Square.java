package module2.baitap.ss7_abstracts_class_and_interface.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Square extends Shape implements Resizeable {
    private double edge = 5;

    public Square() {

    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return edge * edge;
    }

    public double getPerimeter() {
        return edge * 4;
    }

    @Override
    public String toString() {
        return "A Square with edge="
                + getEdge()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Percents Square is :" + getArea() * percent);

    }
}
