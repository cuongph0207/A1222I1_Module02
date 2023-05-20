package module2.thuchanh.ss1_introduction_to_java.tinh_so_ngay_thang_trong_nam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner cc = new Scanner(System.in);
        System.out.println("Nhap thang ban muon tinh ngay : ");
        n = cc.nextInt();
        switch (n){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("Thang "+n+" Co 31 ngay");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("Thang "+n+" Co 30 ngay");
                break;
            case 2 :
                System.out.println("Thang "+n+" Co 28 hoac 29 ngay");
        }
    }
}
