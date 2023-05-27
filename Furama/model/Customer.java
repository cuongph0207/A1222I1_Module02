package module2.Furama.model;

import java.time.LocalDate;

public class Customer extends Person {
    private String type;
    private String address;

    public Customer() {
    }

    public Customer(String type, String address) {
        this.type = type;
        this.address = address;
    }

    public Customer(String id, String name, LocalDate dateOfBirth, String gender, String idCard, String phone, String email, String type, String address) {
        super(id, name, dateOfBirth, gender, idCard, phone, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", gender='" + getGender() + '\'' +
                ", idCard='" + getIdCard() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
