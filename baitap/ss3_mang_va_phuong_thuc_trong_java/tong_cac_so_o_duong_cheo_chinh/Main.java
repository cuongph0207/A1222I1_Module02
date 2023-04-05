package module2.baitap.ss3_mang_va_phuong_thuc_trong_java.tong_cac_so_o_duong_cheo_chinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.print("Nhập kich thước ma trận (axa):");
        int a = cc.nextInt();
        double[][] arr2D = new double[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("Nhập số thực bất kì cho ma trận ở vị trí ô thứ " + j + " hàng thứ " + i + ": ");
                arr2D[i][j] = cc.nextDouble();
                cc.nextLine();
            }
        }
        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < a; i++) {
            sum1 += arr2D[i][i];
            sum2 += arr2D[i][a - i - 1];
        }
        System.out.println("Tổng 2 đường chéo chính của ma trận là: " + (sum1 + sum2));
    }

}
