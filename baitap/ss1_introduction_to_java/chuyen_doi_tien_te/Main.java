package Module02.BaiTap.ss1_Introduction_To_Java.ChuyenDoiTienTe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner cc = new Scanner(System.in);
        System.out.println("Nhap so USD ban muon chuyen : ");
        double usd = cc.nextDouble();
        System.out.println(usd + "USD = "+(usd*rate)+"VND");
    }
}
