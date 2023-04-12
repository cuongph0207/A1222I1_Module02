package module2.baitap.ss6_ke_thua.lop_point2d_va_lop_point3d;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(5, 10);
        System.out.println(point2D.toString());
        point2D.setXY(2, 3);
        System.out.println(point2D.toString());
        Point3D point3D = new Point3D(2, 4, 6);
        System.out.println(point3D.toString());
        point3D.setXYZ(10, 11, 12);
        System.out.println(point3D.toString());
    }
}
