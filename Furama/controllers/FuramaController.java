package module2.Furama.controllers;

import module2.Furama.model.Customer;
import module2.Furama.model.Employee;
import module2.Furama.service.BookingService;
import module2.Furama.service.CustomerService;
import module2.Furama.service.EmployeeService;
import module2.Furama.service.FacilityService;

import java.util.Scanner;

public class FuramaController {
    Customer customer = new Customer();
    Employee employee = new Employee();

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    displayEmployeeManagerment();
                    break;
                case 2:
                    displayCustomerManagerment();
                    break;
                case 3:
                    displayFacilityManagerment();
                    break;
                case 4:
                    displayBookingManagerment();
                    break;
                case 5:
                    displayPromotionManagement();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void displayEmployeeManagerment() {
        EmployeeService employeeService = new EmployeeService();
        boolean check = true;
        System.out.println("1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                employeeService.display();
                break;
            case 2:
                employeeService.add();
                break;
            case 3:
                employeeService.edit();
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    public static void displayCustomerManagerment() {
        CustomerService customerService = new CustomerService();
        boolean check = true;
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                customerService.display();
                break;
            case 2:
                customerService.add();
                break;
            case 3:
                customerService.edit();
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    public static void displayFacilityManagerment() {
        FacilityService facilityService = new FacilityService();
        boolean check = true;
        System.out.println("1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu\n");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                facilityService.display();
                break;
            case 2:
                facilityService.add();
                break;
            case 3:
                facilityService.edit();
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    public static void displayBookingManagerment() {
        BookingService bookingService = new BookingService();
        boolean check = true;
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new contracts\n" +
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu\n");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                bookingService.add();
                break;
            case 2:
                bookingService.display();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                displayMainMenu();
                break;
        }
    }

    public static void displayPromotionManagement() {
        boolean check = true;
        System.out.println("1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                displayMainMenu();
                break;
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
