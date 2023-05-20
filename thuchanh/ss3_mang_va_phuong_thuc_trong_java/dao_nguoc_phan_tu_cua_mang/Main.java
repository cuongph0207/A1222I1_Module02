package module2.thuchanh.ss3_mang_va_phuong_thuc_trong_java.dao_nguoc_phan_tu_cua_mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int number;
        int[] array;
        do{
            System.out.println("Please enter the number of element of array");
            number = cc.nextInt();
        }while (number>20);
        array = new int[number];
        int i = 0;
        while (i<array.length){
            System.out.println("enter element "+(i+1)+" : ");
            array[i] = cc.nextInt();
            i++;
        }
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]);
        }
        System.out.println("\nMang dao nguoc la : ");
        for (int k = array.length-1;k>=0;k--){
            System.out.print(array[k]);
        }
    }
}
