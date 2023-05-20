package module2.thuchanh.ss3_mang_va_phuong_thuc_trong_java.chuyen_doi_nhiet_do;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int choice;
        double fahrenheit, celsius;
        do {
            System.out.println("-------Menu--------");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            System.out.println("Enter your choice : ");
            choice = cc.nextInt();
        } while (choice > 2 || choice < 0);
        switch (choice) {
            case 0:
                System.exit(0);
            case 1:
                System.out.println("Enter Fahrenheit : ");
                fahrenheit = cc.nextDouble();
                System.out.println("Celsius = " + fahrenheitToCelsius(fahrenheit));
                break;
            case 2:
                System.out.println("Enter Celsius : ");
                celsius = cc.nextDouble();
                System.out.println("Fahrenheit = " + celsiusToFahrenheit(celsius));
                break;
        }

    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
