package module2.baitap.ss7_abstracts_class_and_interface.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

public class Main {
    public static void main(String[] args) {
        Shape s[] = new Shape[3];
        s[0] = new Circle(7.0);
        s[1] = new Rectangle(3.0, 4.0);
        s[2] = new Square(6.0);
        for (Shape shape : s) {
            System.out.println("The Area Every Shape is :" + (shape.getArea()));
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
        }

    }
}
