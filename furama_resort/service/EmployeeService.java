package module2.furama_resort.service;

import module2.furama_resort.model.Employee;
import module2.furama_resort.service.IEmployeeService;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeService extends Employee implements IEmployeeService {
    static ArrayList<Employee> employeeList;
    static {
        File employeeFile = new File("D:\\Codegym\\Module02\\A1222I1_Module02\\furama_resort\\data\\csv");
        try {
            OutputStream os = new FileOutputStream(employeeFile);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(employeeList);
            oos.close();
            oos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        employeeList = new ArrayList<>();
        Employee employee = new Employee();

    }
    @Override
    public void display() {
        for(Employee e: employeeList){
            System.out.println(e.toString());
        }
    }

    @Override
    public void addNew() {
        Employee employee = new Employee();
        employee.setIdName();
        enterPersonalInfomation(employee);
        employeeList.add(employee);
    }

    @Override
    public void fix() {
        System.out.println("Enter IDName need to fix:");
        Scanner input = new Scanner(System.in);
        String idNameNeedFix = input.nextLine();
        if(checkIDName(idNameNeedFix)!=null){
            enterPersonalInfomation(Objects.requireNonNull(checkIDName(idNameNeedFix)));
        }else {
            System.out.println("Not exist IDName you Enter");
        }
    }

    private void enterPersonalInfomation(Employee e) {
        e.setName();
        e.setAge();
        e.setGender();
        e.setNumberPhone();
        e.setEmail();
        e.setLevel();
        e.setIdCode();
        e.setRegency();
        e.setSalary();
    }
    private Employee checkIDName(String idNameNeedFix){
        for(Employee e: employeeList){
            if(e.getIdName().equals(idNameNeedFix)){
                return e;
            }
        }
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Enter IDName need to delete:");
        Scanner input = new Scanner(System.in);
        String idNameNeedDel = input.nextLine();
        if(checkIDName(idNameNeedDel)!=null){
            employeeList.remove(checkIDName(idNameNeedDel));
        }
    }


}
