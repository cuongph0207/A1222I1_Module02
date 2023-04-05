package module2.baitap.ss4_lop_va_doi_tuong_trong_java.quaratic_equation;

public class TinhToan {
    private double a, b, c;

    public TinhToan() {

    }

    public TinhToan(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
    double getDoubleSolution(){
        return -b/(2*a);
    }
}