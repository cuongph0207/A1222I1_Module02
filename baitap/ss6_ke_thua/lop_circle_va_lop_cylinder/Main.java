package module2.baitap.ss6_ke_thua.lop_circle_va_lop_cylinder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lớp Circle:");
        Circle circle = new Circle("Blue", 5);
        System.out.println(circle.toString());
        System.out.println("Lớp Cylinder:");
        Cylinder cylinder = new Cylinder("Red", 10, 5);
        System.out.println("Thể Tích Hình Trụ Là :" + cylinder.cylindericalVolume());
        System.out.println(cylinder.toString());
    }
}
