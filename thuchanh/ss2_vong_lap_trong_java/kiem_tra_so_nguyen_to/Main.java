package module2.thuchanh.ss2_vong_lap_trong_java.kiem_tra_so_nguyen_to;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra : ");
        int number = cc.nextInt();
        if (number < 2) {
            System.out.println("Number is not a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i < Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
                i++;
            }
            if (check == true) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }

        }
    }
}
