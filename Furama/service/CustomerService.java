package module2.Furama.service;

import module2.Furama.model.Customer;
import module2.Furama.until.ReadAndWriteCustomer;
import module2.Furama.until.RegexPerson;

import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static LinkedList<Customer> customerList = new LinkedList<>();

    @Override
    public void display() {
        try {
            customerList = (LinkedList<Customer>) ReadAndWriteCustomer.readCSV();
            for (Customer customer : customerList) {
                System.out.println(customer);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        for (int i =0; i<list.size();i++){
//            System.out.println(list.get(i));
//        }

    }

    @Override
    public void add() {
        try {
            customerList = (LinkedList<Customer>) ReadAndWriteCustomer.readCSV();
            for (Customer customer : customerList) {
                System.out.println(customer);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id");
        String id = sc.nextLine();
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
        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();
        String idCard = RegexPerson.idCard();
        String email = RegexPerson.email();
        String type = null;
        System.out.println(" loại: ");
        System.out.println("1.Diamond");
        System.out.println("2.Platinium");
        System.out.println("3.Gold");
        System.out.println("4.Silver");
        System.out.println("5.Member");
        do {
            System.out.println("Chọn loại: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    type = "Diamond";
                    break;
                case 2:
                    type = "Platinium";
                    break;
                case 3:
                    type = "Gold";
                    break;
                case 4:
                    type = "Silver";
                    break;
                case 5:
                    type = "Member";
                    break;
            }
        } while (choose < 1 || choose > 5);

        Customer customer = new Customer(id, name, age, gender, idCard, email, type, address);
        customerList.add(customer);
        //write
        try {
            ReadAndWriteCustomer.writeCSV(customerList);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        display();
    }

    @Override
    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào id cần sửa thông tin");
        String id = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)) {
                check = true;
                String name = RegexPerson.name();
                LocalDate age = RegexPerson.age();
                System.out.println("Chọn giới tính");
                System.out.println("1.Nam");
                System.out.println("2.Nữ");
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
                System.out.println("Nhập địa chỉ");
                String address = sc.nextLine();
                String idCard = RegexPerson.idCard();
                String email = RegexPerson.email();
                //loại khách
                String type = null;
                System.out.println(" loại: ");
                System.out.println("1.Diamond");
                System.out.println("2.Platinium");
                System.out.println("3.Gold");
                System.out.println("4.Silver");
                System.out.println("5.Member");
                do {
                    System.out.println("Chọn loại: ");
                    choose = Integer.parseInt(sc.nextLine());
                    switch (choose) {
                        case 1:
                            type = "Diamond";
                            break;
                        case 2:
                            type = "Platinium";
                            break;
                        case 3:
                            type = "Gold";
                            break;
                        case 4:
                            type = "Silver";
                            break;
                        case 5:
                            type = "Member";
                            break;
                    }
                } while (choose < 1 || choose > 5);
                Customer customer = new Customer(id, name, age, gender, idCard, email, type, address);
                customerList.set(i, new Customer(id, name, age, gender, idCard, email, type, address));
                try {
                    ReadAndWriteCustomer.writeCSV(customerList);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                display();

            }
        }
        if (!check) {
            System.out.println("Không tìm thấy id");
        }
    }

    @Override
    public void delete() {

    }
}
