package module2.baitap.ss7_abstracts_class_and_interface.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Main {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Rectangle(5.0, 10.0);
        shape[1] = new Circle(7.0);
        shape[2] = new Square(10.0);
        System.out.println("The Old Area: ");
        for (Shape element : shape) {
            System.out.println(element.getArea());
        }


        Resizeable resizeable[] = new Resizeable[3];
        resizeable[0] = new Rectangle(5.0, 10.0);
        resizeable[1] = new Circle(7.0);
        resizeable[2] = new Square(10.0);
        double random = Math.random() * 100;
        System.out.println("The New Area: ");
        for (Resizeable resize : resizeable) {
            resize.resize(random);
        }
    }


}
