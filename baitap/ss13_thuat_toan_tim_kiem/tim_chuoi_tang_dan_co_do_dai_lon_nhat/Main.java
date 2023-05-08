package module2.baitap.ss13_thuat_toan_tim_kiem.tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.println("Input String : ");
        n = sc.nextLine();
        int temp = 0;
        String arr[] = n.split("");
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i].charAt(0);
            if (temp < (int) ch) {
                System.out.print(ch);
                temp = (int) ch;
            }
        }
    }
}
