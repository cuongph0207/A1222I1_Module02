package module2.baitap.ss7_abstracts_class_and_interface.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

public class Square extends Shape implements Colorable {

    private double size = 1.0;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return this.size * this.size;
    }

    @Override
    public String toString() {
        return "Square [size=" + size + "The Area is :" + getArea() + "]";
    }

    @Override
    public void howToColor() {
        System.out.println("Square Color is :" + "Color all four sides.");

    }
}

