package module2.baitap.ss3_mang_va_phuong_thuc_trong_java.xoa_phan_tu_khoi_mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng : ");
        int size = cc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập Các Phần Tử Của Mảng : ");
            arr[i] = cc.nextInt();
            cc.nextLine();
        }
        System.out.print("Nhập giá trị cần xóa trong mảng:");
        int valueDel = cc.nextInt();
        int indexDel;
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (valueDel == arr[i]) {
                indexDel = i;
                flag = true;
                for (int j = indexDel; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        if (flag) {
            System.out.print("Mảng sau khi xóa : ");
            for (int i = 0; i < size - 1; i++) {
                System.out.print(arr[i] + " , ");
            }
        } else {
            System.out.println("Không tồn tại giá trị " + valueDel + " trong mảng");
        }

    }
}