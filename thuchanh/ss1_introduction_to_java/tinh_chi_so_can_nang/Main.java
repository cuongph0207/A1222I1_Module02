package module2.thuchanh.ss1_introduction_to_java.tinh_chi_so_can_nang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double bmi,weight,height;
        Scanner cc = new Scanner(System.in);
        System.out.println("Nhap weight : ");
        weight = cc.nextDouble();
        System.out.println("Nhap height : ");
        height = cc.nextDouble();
        bmi = weight/((height/100)*(height/100));
        if(bmi<18.5){
            System.out.println("Underweight");
        }else if(bmi >= 18.5 && bmi<=25.0){
            System.out.println("Normal");
        }else if (bmi>=25.0 && bmi<=30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
