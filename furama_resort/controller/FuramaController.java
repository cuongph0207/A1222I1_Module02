package module2.furama_resort.controller;

import module2.furama_resort.model.Employee;
import module2.furama_resort.service.CustomerService;
import module2.furama_resort.service.EmployeeService;

import java.util.Scanner;

public class FuramaController {
    static EmployeeService employeeService =  new EmployeeService();
    static CustomerService customerService = new CustomerService();
    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            Scanner input = new Scanner(System.in);
            switch (input.nextInt()) {
                case 1:{
                    displayEmployeeManagement();
                    break;
                }
                case 2: {
                    displayCustommerManagement();
                    break;
                }
                case 3: {
                    displayFacilityManagement();
                    break;
                }
                case 4: {
                    displayBookingManagement();
                    break;
                }
                case 5: {
                    displayPromotionManagement();
                    break;
                }
                case 6: {
                    System.exit(0);
                }
            }
        }
    }
    public static void displayEmployeeManagement(){
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. Return main menu");
            Scanner input = new Scanner(System.in);
            switch (input.nextInt()) {
                case 1:{
                    employeeService.display();
                    break;
                }
                case 2:{
                    employeeService.addNew();
                    break;
                }
                case 3: {
                    employeeService.fix();
                    break;
                }
                case 4: {
                    displayMainMenu();
                    break;
                }
            }
        }
    }
    public static void displayFacilityManagement(){
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            Scanner input = new Scanner(System.in);
            switch (input.nextInt()) {
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    displayMainMenu();
                    break;
                }
            }
        }
    }
    public static void displayCustommerManagement(){
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            Scanner input = new Scanner(System.in);
            switch (input.nextInt()) {
                case 1:{
                    customerService.display();
                    break;
                }
                case 2:{
                    customerService.addNew();
                    break;
                }
                case 3: {
                    customerService.fix();
                    break;
                }
                case 4: {
                    displayMainMenu();
                    break;
                }
            }
        }
    }
    public static void displayBookingManagement(){
        boolean check = true;
        while (check) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contract");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            Scanner input = new Scanner(System.in);
            switch (input.nextInt()) {
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    displayMainMenu();
                    break;
                }
            }
        }
    }
    public static void displayPromotionManagement(){
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            Scanner input = new Scanner(System.in);
            switch (input.nextInt()) {
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3: {
                    displayMainMenu();
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
