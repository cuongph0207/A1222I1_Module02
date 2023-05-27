package module2.Furama.service;

import module2.Furama.model.Customer;
import module2.Furama.model.Employee;
import module2.Furama.until.ReadAndWriteEmployee;
import module2.Furama.validate.RegexPerson;
import module2.Furama.validate.Validate;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static ArrayList<Employee> employeeList = new ArrayList<>();

    @Override
    public void display() {
        try {
            employeeList = (ArrayList<Employee>) ReadAndWriteEmployee.readCSV();
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add() {
        try {
            employeeList = (ArrayList<Employee>) ReadAndWriteEmployee.readCSV();
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        String id = RegexPerson.idEmployee();
        String name = RegexPerson.name();
        LocalDate age = RegexPerson.age();
        System.out.println("Chọn Giới Tính : ");
        System.out.println("1.Nam || 2.Nu || 3.Khac");
        String gender = null;
        int choose;
        do {
            System.out.println("Chọn giới tính:");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    gender = "Nam";
                    break;
                case 2:
                    gender = "Nữ";
                    break;
            }
        } while (choose < 1 || choose > 2);
        String idCard = RegexPerson.idCard();
        String phone = RegexPerson.phone();
        String email = RegexPerson.email();
        // trình độ
        String level = null;
        System.out.println("Trình độ: ");
        System.out.println("1.Trung cấp");
        System.out.println("2.Cao đẳng");
        System.out.println("3.Đại học");
        System.out.println("4.Sau đại học");
        do {
            System.out.println("Chọn trình độ:");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    level = "Trung cấp";
                    break;
                case 2:
                    level = "Cao đẳng";
                    break;
                case 3:
                    level = "Đại học";
                    break;
                case 4:
                    level = "Sau đại học";
                    break;
            }

        } while (choose < 1 || choose > 4);
        double salary = RegexPerson.salary();
        String position = null;
        System.out.println("Chức vụ: ");
        System.out.println("1.Lễ Tân");
        System.out.println("2.Phục vụ");
        System.out.println("3.Chuyên viên");
        System.out.println("4.Giám sát");
        System.out.println("5.Quản lý");
        System.out.println("6.Giám đốc");
        do {
            System.out.println("Chọn chức vụ: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    position = "Lễ tân";
                    break;
                case 2:
                    position = "Phục vụ";
                    break;
                case 3:
                    position = "Chuyên viên";
                    break;
                case 4:
                    position = "Giám sát";
                    break;
                case 5:
                    position = "Quản lý";
                    break;
                case 6:
                    position = "Giám đốc";
                    break;
            }
        } while (choose < 1 || choose > 6);
        Employee employee = new Employee(id, name, age, gender, idCard, phone, email, level, position, salary);
        employeeList.add(employee);
        try {
            ReadAndWriteEmployee.writeCSV(employeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        display();
    }


    @Override
    public void edit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào id cần sửa thông tin: ");
        String inputID = input.nextLine();// tìm id
        boolean check = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(inputID)) {
                check = true;
                String name = RegexPerson.name();
                LocalDate age = RegexPerson.age();
                // chọn giới tính
                System.out.println("Chọn giới tính");
                System.out.println("1.Nam");
                System.out.println("2.Nữ");
                String gender = null;
                int choose;
                do {
                    System.out.println("Chọn giới tính:");
                    choose = Integer.parseInt(input.nextLine());
                    switch (choose) {
                        case 1:
                            gender = "Nam";
                            break;
                        case 2:
                            gender = "Nữ";
                            break;
                    }
                } while (choose < 1 || choose > 2);
                String idCard = RegexPerson.idCard();
                String phone = RegexPerson.phone();
                String email = RegexPerson.email();
                String level = null;
                System.out.println("Trình độ: ");
                System.out.println("1.Trung cấp");
                System.out.println("2.Cao đẳng");
                System.out.println("3.Đại học");
                System.out.println("4.Sau đại học");
                do {
                    System.out.println("Chọn trình độ:");
                    choose = Integer.parseInt(input.nextLine());
                    switch (choose) {
                        case 1:
                            level = "Trung cấp";
                            break;
                        case 2:
                            level = "Cao đẳng";
                            break;
                        case 3:
                            level = "Đại học";
                            break;
                        case 4:
                            level = "Sau đại học";
                            break;
                    }

                } while (choose < 1 || choose > 4);
                double salary = RegexPerson.salary();
                // chức vụ
                String position = null;
                System.out.println("Chức vụ: ");
                System.out.println("1.Lễ Tân");
                System.out.println("2.Phục vụ");
                System.out.println("3.Chuyên viên");
                System.out.println("4.Giám sát");
                System.out.println("5.Quản lý");
                System.out.println("6.Giám đốc");
                do {
                    System.out.println("Chọn chức vụ: ");
                    choose = Integer.parseInt(input.nextLine());
                    switch (choose) {
                        case 1:
                            position = "Lễ tân";
                            break;
                        case 2:
                            position = "Phục vụ";
                            break;
                        case 3:
                            position = "Chuyên viên";
                            break;
                        case 4:
                            position = "Giám sát";
                            break;
                        case 5:
                            position = "Quản lý";
                            break;
                        case 6:
                            position = "Giám đốc";
                            break;
                    }
                } while (choose < 1 || choose > 6);
                employeeList.set(i, new Employee(inputID, name, age, gender, idCard, phone, email, level, position, salary));
                try {
                    ReadAndWriteEmployee.writeCSV(employeeList);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                display();
            }
        }
        if (!check) {
            System.out.println("ko tìm thấy id");
        }


    }


    @Override
    public void delete() {

    }
}
