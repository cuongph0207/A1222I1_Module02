package module2.thuchanh.ss1_introduction_to_java.giai_phuong_trinh_bac_nhat;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b;
        Scanner cc = new Scanner(System.in);
        System.out.println("Nhap a : ");
        a = cc.nextDouble();
        System.out.println("Nhap b : ");
        b = cc.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println("PT vô số nghiệm");
            }else if(b!=0){
                System.out.println("PT vô nghiệm");
            }
        } else {
            System.out.println("Nghiem PT : "+(-b/a));
        }
    }
}
