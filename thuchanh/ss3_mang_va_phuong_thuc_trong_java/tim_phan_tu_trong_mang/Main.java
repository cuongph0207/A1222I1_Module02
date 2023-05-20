package module2.thuchanh.ss3_mang_va_phuong_thuc_trong_java.tim_phan_tu_trong_mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        String[] array = {"anh", "bao", "cuong", "duyen", "gia", "huy", "khang", "linh"};
        System.out.println("Enter name : ");
        String name = cc.nextLine();
        boolean isTrue = false;
        for(int i = 0;i< array.length;i++){
            if(name.equals(array[i])){
                System.out.println("vi tri cua "+name+" la : "+(i+1));
                isTrue = true;
                break;
            }else {
                isTrue = false;
            }
        }
        if(!isTrue){
            System.out.println("Khong tim thay ten");
        }
    }
}
