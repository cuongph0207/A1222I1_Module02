package module2.baitap.ss3_mang_va_phuong_thuc_trong_java.tinh_tong_1_so_o_1_cot_xac_dinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng ma trận:");
        int width = cc.nextInt();
        System.out.print("Nhập chiều cao ma trận:");
        int height = cc.nextInt();
        double[][] arr2D = new double[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("Nhập số thực bất kì cho ma trận ở vị trí ô thứ " + (j) + " hàng thứ " + (i) + ": ");
                arr2D[i][j] = cc.nextDouble();
                cc.nextLine();
            }
        }
        System.out.print("Nhập cột mà bạn muốn tính tổng");
        int colNum = cc.nextInt();
        double sum = 0;
        for (int i = 0; i < width; i++) {
            sum += arr2D[colNum][i];
        }
        System.out.println("Tổng các số ở cột thứ " + colNum + " là: " + sum);
    }
}