package module2.Furama.until;

import module2.Furama.model.Customer;
import module2.Furama.validate.Validate;

import java.io.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


public class ReadAndWriteCustomer {
    private static final String FILE_PATH = "D:\\Codegym\\Module02\\A1222I1_Module02\\Furama\\data\\Customer.csv";

    public static List<Customer> readCSV() throws IOException {
        List<Customer> customers = new LinkedList<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        String line;
        String[] temp;
        Customer cus;

        while ((line = buff.readLine()) != null && !line.equals("")) {
            temp = line.split(",");
            String id = temp[0];
            String name = temp[1];
            LocalDate age = Validate.dateInputDOB(temp[2]);
            String gender = temp[3];
            String idCard = temp[4];
            String phone = temp[5];
            String email = temp[6];
            String type = temp[7];
            String address = temp[8];
            cus = new Customer(id, name, age, gender, idCard, phone, email, type ,address);
            customers.add(cus);
        }
        buff.close();
        return customers;
    }

    public static void writeCSV(List<Customer> customerList) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Customer customer : customerList
             ) {
            {
                bufferedWriter.write(customer.getId() + "," + customer.getName() + "," + customer.getDateOfBirth() + "," + customer.getGender() +
                        "," + customer.getIdCard() + "," + customer.getPhone() + "," + customer.getEmail() + "," + customer.getType() + "," + customer.getAddress() + "\n");

            }
        }
        bufferedWriter.close();
    }
}

