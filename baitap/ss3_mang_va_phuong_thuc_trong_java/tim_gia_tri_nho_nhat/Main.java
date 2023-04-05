package Module02.BaiTap.ss3_MangVaPhuongThucTrongJava.TimGiaTriNhoNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng:");
        int size = cc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập các số nguyên bất kỳ: ");
            arr[i] = cc.nextInt();
            cc.nextLine();
        }
        System.out.println("Giá trị nhỏ nhất của mảng là: "+ minValue(arr));
    }
    public  static int minValue(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min >=arr[i] ){
                min = arr[i];
            }
        }
        return min;
    }
}