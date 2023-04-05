package module2.baitap.ss4_lop_va_doi_tuong_trong_java.quaratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter a : ");
        a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter b : ");
        b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter c : ");
        c = Double.parseDouble(scanner.nextLine());
        TinhToan tinhtoan = new TinhToan(a,b,c);
        if (tinhtoan.getDiscriminant() > 0){
            System.out.printf("PT Có 2 nghiệm phân biệt : Nghiệm 1 : %f nghiệm 2 : %f  " , tinhtoan.getRoot1() , tinhtoan.getRoot2());
        }else if (tinhtoan.getDiscriminant() == 0){
            System.out.printf("PT Có 1 nghiệm kép : Nghiệm : %f ",tinhtoan.getDoubleSolution());
        }else {
            System.out.println("PT Vô Nghiệm");
        }
    }
}
