package module2.thuchanh.ss1_introduction_to_java.su_dung_toan_tu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chieuRong;
        int chieuDai;
        Scanner cc = new Scanner(System.in);
        System.out.println("Nhap chieu dai : ");
        chieuDai = cc.nextInt();
        System.out.println("Nhap chieu rong : ");
        chieuRong = cc.nextInt();
        System.out.println("Dien tich = "+chieuDai*chieuRong);

    }
}
