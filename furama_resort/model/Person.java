package module2.furama_resort.model;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public abstract class Person {
    Scanner input = new Scanner(System.in);
    private String id;
    private String name;
    private int dayOfBirth;
    private String gender;
    private int idCode;
    private int numberPhone;
    private String email;

    public Person() {
    }

    public Person(Scanner input, String id, String name, int dayOfBirth, String gender, int idCode, int numberPhone, String email) {
        this.input = input;
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idCode = idCode;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "input=" + input +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", gender='" + gender + '\'' +
                ", idCode=" + idCode +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                '}';
    }
}