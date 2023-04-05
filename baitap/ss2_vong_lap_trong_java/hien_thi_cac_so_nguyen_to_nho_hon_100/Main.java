package Module02.BaiTap.ss2_VongLapTrongJava.HienThiCacSoNguyenToNhoHon100;

public class Main {
    public static void main(String[] args) {
        for (int j = 0; j < 100; j++) {
            if (check_is_Prime(j) != 0) {
                System.out.print(check_is_Prime(j) + " , ");
            }
        }
    }

    public static int check_is_Prime(int number) {
        boolean flag = true;
        if (number < 2) {
            flag = false;
        } else if (number == 2) {
            flag = true;
        } else if (number % 2 == 0) {
            flag = false;
        } else {
            for (int i = 3; i < number - 1; i += 2) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            return number;
        } else
            return 0;
    }
}
