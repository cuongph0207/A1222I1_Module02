package module2.furama_resort.model;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public abstract class Person {
    Scanner input = new Scanner(System.in);
    private String idName;
    private String name;
    private int age;
    private String gender;
    private int idCode;
    private int numberPhone;
    private String email;

    public Person(String idName, String name, int age, String gender, int idCode, int numberPhone, String email) {
        this.idName = idName;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idCode = idCode;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public Person() {

    }

    public String getIdName() {
        return idName;
    }

    public void setIdName() {
        System.out.println("Enter IDName:");
        String newIDName = input.nextLine();
        this.idName = newIDName;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("Enter Name:");
        this.name = input.nextLine();
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        try {
            System.out.println("Enter Age:");
            this.age = parseInt(input.nextLine());
        } catch (NumberFormatException numberFormatException){
            System.out.println("Please, Try enter age:");
            this.age = parseInt(input.nextLine());
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender() {
        System.out.println("Enter Gender (Male/Female/Other):");
        this.gender = input.nextLine();

    }

    public long getIdCode() {
        return idCode;
    }

    public void setIdCode() {
        try {
            System.out.println("Enter IDCode:");
            this.idCode = (int) parseLong(input.nextLine());
        } catch (NumberFormatException numberFormatException){
            System.out.println("Please, Try enter IDCode:");
            this.idCode = (int) parseLong(input.nextLine());
        }
    }
    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone() {
        try {
            System.out.println("Enter numberphone:");
            this.numberPhone = parseInt(input.nextLine());
        } catch (NumberFormatException numberFormatException){
            System.out.println("Please, Try enter numberphone:");
            this.numberPhone = parseInt(input.nextLine());
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        System.out.println("Enter Email:");
        this.email = input.nextLine();
    }

    @Override
    public String toString() {
        return
                "idName='" + idName + '\'' +
                        ", name='" + name + '\'' +
                        ", age=" + age +
                        ", gender='" + gender + '\'' +
                        ", idCode=" + idCode +
                        ", numberPhone=" + numberPhone +
                        ", email='" + email + '\'';
    }
}