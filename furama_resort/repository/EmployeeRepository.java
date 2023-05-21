package module2.furama_resort.repository;

import module2.furama_resort.model.Customer;
import module2.furama_resort.model.Employee;
import module2.furama_resort.service.EmployeeService;

import java.io.*;
import java.util.ArrayList;

public class EmployeeRepository implements IEmployeeRepository{
    static ArrayList<Employee> employeeList;
    File employeeFile = new File("D:\\Codegym\\Module02\\A1222I1_Module02\\furama_resort\\data\\employee.csv");


    {
        try {
            OutputStream os = new FileOutputStream(employeeFile);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (Employee employee : employeeList) {
                oos.writeObject(employee);
            }
            oos.flush();
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
