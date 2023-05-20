package module2.furama_resort.model;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Employee extends Person {
    private String level;
    private String regency;
    private int salary;

    public Employee() {
    }

    public Employee(Scanner input, String id, String name, int dayOfBirth, String gender, int idCode, int numberPhone, String email, String level, String regency, int salary) {
        super(input, id, name, dayOfBirth, gender, idCode, numberPhone, email);
        this.level = level;
        this.regency = regency;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel() {
        System.out.println("Chose your level: ");
        System.out.println("1. High school");
        System.out.println("2. Colleague");
        System.out.println("1. University");
        System.out.println("1. Master");
        int choice = parseInt(input.nextLine());
        switch (choice) {
            case 1:
                this.level = "High school";
                break;
            case 2:
                this.level = "Colleague";
                break;
            case 3:
                this.level = "University";
                break;
            case 4:
                this.level = "Master";
                break;
        }
    }

    public String getRegency() {
        return regency;
    }

    public void setRegency() {
        System.out.println("Chose your regency: ");
        System.out.println("1. Receptionist");
        System.out.println("2. Staff");
        System.out.println("3. Expert");
        System.out.println("4. Supervisor");
        System.out.println("5. Manager");
        System.out.println("6. Director");
        int choice = parseInt(input.nextLine());
        switch (choice) {
            case 1:
                this.regency = "Receptionist";
                break;
            case 2:
                this.regency = "Staff";
                break;
            case 3:
                this.regency = "Expert";
                break;
            case 4:
                this.regency = "Supervisor";
                break;
            case 5:
                this.regency = "Manager";
                break;
            case 6:
                this.regency = "Director";
                break;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary() {
        System.out.println("Enter Salary:");
        this.salary = parseInt(input.nextLine());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", regency='" + regency + '\'' +
                ", salary=" + salary +
                ", input=" + input +
                '}';
    }
}