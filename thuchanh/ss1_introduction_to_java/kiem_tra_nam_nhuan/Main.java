package module2.thuchanh.ss1_introduction_to_java.kiem_tra_nam_nhuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.println("Nhap nam can kiem tra : ");
        int year = cc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            } else {
                System.out.printf("%d is a leap year", year);
            }
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }

}

