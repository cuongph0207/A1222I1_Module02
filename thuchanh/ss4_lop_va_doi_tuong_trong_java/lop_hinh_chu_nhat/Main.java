package module2.thuchanh.ss4_lop_va_doi_tuong_trong_java.lop_hinh_chu_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.println("Enter the width : ");
        double width = cc.nextDouble();
        System.out.println("Enter the height : ");
        double height = cc.nextDouble();
        Rectangle rectangle = new Rectangle(7, 8);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
