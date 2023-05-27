package module2.Furama.until;

import module2.Furama.model.Employee;
import module2.Furama.validate.Validate;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {

    private static final String FILE_PATH = "D:\\Codegym\\Module02\\A1222I1_Module02\\Furama\\data\\Employee.csv";

    public static List<Employee> readCSV() throws IOException {
        List<Employee> employees = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        String line;
        String[] temp;
        Employee emp;

        while ((line = buff.readLine()) != null && !line.equals("")) {
            temp = line.split(",");
            String id = temp[0];
            String name = temp[1];
            LocalDate age = Validate.dateInputDOB(temp[2]);
            String gender = temp[3];
            String idCard = temp[4];
            String phone = temp[5];
            String email = temp[6];
            String level = temp[7];
            double salary = Double.parseDouble(temp[8]);
            String position = temp[9];

            emp = new Employee(id, name, age, gender, idCard, phone, email, level, position,salary);
            employees.add(emp);
        }
        buff.close();
        return employees;
    }

    public static void writeCSV(List<Employee> employeeList) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH, false);
        BufferedWriter bufferedWriter;
        bufferedWriter = new BufferedWriter(fileWriter);
        for (Employee employee : employeeList) {
            bufferedWriter.write(employee.getId() + "," + employee.getName() + "," + employee.getDateOfBirth() + "," + employee.getGender() +
                    "," + employee.getIdCard() + "," + employee.getPhone() + "," + employee.getEmail() + "," + employee.getLevel() + "," + employee.getSalary() + "," +
                    employee.getPosition() + "\n");
        }

        bufferedWriter.close();
    }
}
