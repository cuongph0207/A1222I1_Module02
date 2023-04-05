package Module02.BaiTap.ss2_VongLapTrongJava.InRa20SoNguyenTo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbers = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số số nguyên tố muốn in ra: ");
        numbers = input.nextInt();
        int count = 0;
        if (count <= numbers) {
            for (int n = 2; count < numbers; n++) {
                boolean isPrime = true;
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(n + " , ");
                    count++;
                }
            }
        }
    }
}



