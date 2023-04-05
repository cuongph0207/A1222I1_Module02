package Module02.BaiTap.ss3_MangVaPhuongThucTrongJava.DemSoLanXuatHienCuaKiTu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String str = cc.nextLine();
        System.out.print("Nhập 1 ký tự bạn muốn kiểm tra: ");
        char character = cc.nextLine().charAt(0);
        int count =0;
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            char chaStr = str.charAt(i);
            if(character ==chaStr){
                count++;
                flag = true;
            }
        }
        if(flag){
            System.out.println("Ký tự "+character+" xuất hiện "+count+" lần trong chuỗi "+ str);
        }else {
            System.out.println("Ký tự "+character+" không xuất hiện trong chuỗi "+ str);
        }
    }
}
