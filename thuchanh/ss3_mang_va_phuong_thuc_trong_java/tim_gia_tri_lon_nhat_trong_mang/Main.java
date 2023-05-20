package module2.thuchanh.ss3_mang_va_phuong_thuc_trong_java.tim_gia_tri_lon_nhat_trong_mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int number;
        int[] array;
        do{
            System.out.println("Enter the number of ti phu : ");
            number = cc.nextInt();
        }while (number>20);
        int i = 0;
        array = new int[number];
        while (i<array.length){
            System.out.println("Enter element "+(i+1)+" : ");
            array[i] = cc.nextInt();
            i++;
        }
        for(int j = 0;j<array.length;j++){
            System.out.print(array[j]+" ");
        }
        int max = array[0];
        for (int k = 0;k< array.length;k++){
            if(array[k]>max){
                max = array[k];
            }
        }
        System.out.println(max);
    }
}
