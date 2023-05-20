package module2.furama_resort.repository;

import module2.furama_resort.model.Employee;
import module2.furama_resort.service.EmployeeService;

import java.io.*;

public class EmployeeRepository implements IEmployeeRepository{
    File employeeFile = new File("D:\\Codegym\\Module02\\A1222I1_Module02\\furama_resort\\data\\employee.csv");
    OutputStream os;

    {
        try {
            os = new FileOutputStream(employeeFile);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            Employee employee = new Employee();
            oos.writeObject(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
