package module2.Furama.service;

import module2.Furama.model.Customer;
import module2.Furama.until.ReadAndWriteCustomer;
import module2.Furama.validate.RegexPerson;

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
        String id = RegexPerson.idCustomer();
        String name = RegexPerson.name();
        LocalDate age = RegexPerson.age();
        System.out.println("Chọn Giới Tính : ");
        System.out.println("1.Nam || 2.Nữ || 3.Khác");
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
        //loại khách
        String type = null;
        System.out.println("Loại: ");
        System.out.println("1.Diamond");
        System.out.println("2.Platinum");
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
                    type = "Platinum";
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
        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();

        Customer customer = new Customer(id, name, age, gender, idCard,phone,email, type, address);
        customerList.add(customer);
        //write
        try {
            ReadAndWriteCustomer.writeCSV(customerList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        display();
    }

    @Override
    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID Customer Cần Sửa Thông Tin : ");
        String id = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)) {
                check = true;
                String name = RegexPerson.name();
                LocalDate age = RegexPerson.age();
                System.out.println("Chọn Giới Tính : ");
                System.out.println("1.Nam");
                System.out.println("2.Nữ");
                String gender = null;
                int choose;
                do {
                    System.out.println("Chọn Giới Tính :");
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
                //loại khách
                String type = null;
                System.out.println(" loại: ");
                System.out.println("1.Diamond");
                System.out.println("2.Platinum");
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
                            type = "Platinum";
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
                System.out.println("Nhập địa chỉ");
                String address = sc.nextLine();
                Customer customer = new Customer(id, name, age, gender, idCard, phone,email, type, address);
                customerList.set(i, new Customer(id, name, age, gender, idCard, phone,email, type, address));
                try {
                    ReadAndWriteCustomer.writeCSV(customerList);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                display();

            }
            }
        if (!check) {
            System.out.println("Không Tìm Thấy ID");
        }

    }

    @Override
    public void delete() {

    }
}
