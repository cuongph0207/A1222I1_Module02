package module2.furama_resort.model;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Customer extends Person{
    public Customer(String idName, String name, int age, String gender, int idCode, int numberPhone, String email) {
        super(idName, name, age, gender, idCode, numberPhone, email);
    }
    private String rankCustomer;
    private String address;

    public Customer() {
    }

    public String getRankCustomer() {
        return rankCustomer;
    }

    public void setRankCustomer() {
        System.out.println("1. Diamond");
        System.out.println("2. Platinum");
        System.out.println("3. Gold");
        System.out.println("4. Silver");
        System.out.println("5. Member");
        Scanner input = new Scanner(System.in);
        int choice = parseInt(input.nextLine());
        switch (choice){
            case 1:
                this.rankCustomer = "Diamond";
                break;
            case 2:
                this.rankCustomer = "Platinum";
                break;
            case 3:
                this.rankCustomer = "Gold";
                break;
            case 4:
                this.rankCustomer = "Silver";
                break;
            case 5:
                this.rankCustomer = "Member";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        System.out.println("Enter Customer's address:");
        this.address = input.nextLine();
    }

    public Customer(String idName, String name, int age, String gender, int idCode, int numberPhone, String email, String categoryCustomer, String address) {
        super(idName, name, age, gender, idCode, numberPhone, email);
        this.rankCustomer = categoryCustomer;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "rankCustomer='" + rankCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
