package Module02.BaiTap.ss3_MangVaPhuongThucTrongJava.ThemPhanTuVaoMang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng:");
        int size = cc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử của mảng : ");
            arr[i] = cc.nextInt();
            cc.nextLine();
        }
        System.out.print("Nhập giá trị cần thêm trong mảng : ");
        int valueAdd = cc.nextInt();
        System.out.print("Nhập vị trí cần thêm trong mảng : ");
        int indexAdd = cc.nextInt();
        boolean flag = false;
        if (indexAdd >= 0 && indexAdd <= size) {
            flag = true;
            int[] arr1 = new int[size + 1];
            for (int i = 0; i < indexAdd; i++) {
                arr1[i] = arr[i];
            }
            arr1[indexAdd] = valueAdd;
            for (int i = indexAdd + 1; i < size + 1; i++) {
                arr1[i] = arr[i - 1];
            }
            if (flag) {
                System.out.println("Mảng cũ :");
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + ", ");
                }
                System.out.println();
                System.out.println("Mảng sau khi thêm :");
                for (int i = 0; i < size + 1; i++) {
                    System.out.print(arr1[i] + ", ");
                }
            } else {
                System.out.print("Vượt quá kích thước của mảng!");
            }

        }

    }
}