package Module02.BaiTap.ss2_VongLapTrongJava.InRaCacHinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        int a, b;
        do {
            System.out.println("Menu");
            System.out.println("1. In Hinh Chu Nhat");
            System.out.println("2. In Hinh Tam Giac Can");
            System.out.println("3. In Hinh Tam Giac Vuong");
            System.out.println("Nhap Lua Chon Cua Ban : ");
            choice = input.nextInt();
        } while (choice > 3 && choice < 1);
        switch (choice) {
            case 1:
                System.out.println("Nhap Chieu Dai");
                a = input.nextInt();
                System.out.println("Nhap Chieu Rong");
                b = input.nextInt();
                for (int i = 0; i < a; i++) {
                    System.out.println();
                    for (int j = 0; j < b; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 2:
                do {
                    System.out.println("Nhập Chieu Cao");
                    a = input.nextInt();
                    System.out.println("Menu");
                    System.out.println("1. In Tam Giac Vuong Goc Tren Trai");
                    System.out.println("2. In Tam Giac Vuong Goc Tren Phai");
                    System.out.println("3. In Tam Giac Vuong Goi Duoi Trai");
                    System.out.println("4. In Tam Giac vuong Goc Duoi Phai");
                    System.out.println("Nhap Lua Chon Cua Ban: ");
                    choice = input.nextInt();
                } while (choice < 1 && choice > 4);
                switch (choice) {
                    case 1:
                        for (int i = a; i > 0; i--) {
                            for (int j = 0; j < i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        int x = 1;
                        for (int i = 0; i < a; i++) {
                            for (int k = 1; k < x; k++) {
                                System.out.print(" ");
                            }
                            for (int j = 5; j > i; j--) {
                                System.out.print("*");
                            }
                            System.out.println();
                            x++;
                        }
                        break;
                    case 3:
                        for (int i = 0; i < a; i++) {
                            for (int j = 0; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 4:
                        int y = 1;
                        for (int i = a; i > 0; i--) {
                            for (int j = 0; j < i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 0; k < y; k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                            y++;
                        }
                        break;
                    case 5:
                        System.exit(5);
                    default:
                        System.out.println("Chua Chon");
                }
                break;
            case 3:
                System.out.println("Nhap Chieu Cao");
                a = input.nextInt();
                int y = 1;
                for (int i = a; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < y; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    y += 2;
                }
                break;
            default:
                System.out.println("Chua Chon");
        }
    }
}
