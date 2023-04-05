package Module02.BaiTap.ss3_MangVaPhuongThucTrongJava.TimPhanTuLonNhatTrongMang2Chieu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng ma trận:");
        int width = scanner.nextInt();
        System.out.print("Nhập chiều cao ma trận:");
        int height = scanner.nextInt();
        double[][] arr2D = new double[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("Nhập số thực bất kì cho ma trận ở vị trí ô thứ " + (j + 1) + " hàng thứ " + (i + 1) + ": ");
                arr2D[i][j] = scanner.nextDouble();
                scanner.nextLine();
            }
        }
        int indexHeight = 0;
        int indexWidth = 0;
        boolean flag = false;
        double max = arr2D[0][0];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (max <= arr2D[i][j]) {
                    max = arr2D[i][j];
                    indexWidth = j;
                    indexHeight = i;
                    flag = true;
                }
            }
        }
        if (flag) {
            System.out.println("Giá trị lớn nhất của ma trận là: " + max);
            System.out.println("Vị trí của giá trị lớn nhất là ô thứ " + (indexWidth + 1) + " hàng thứ " + (indexHeight + 1));
        }

    }
}