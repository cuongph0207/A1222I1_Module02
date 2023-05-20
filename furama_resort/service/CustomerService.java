package module2.furama_resort.service;

import module2.furama_resort.model.Customer;
import module2.furama_resort.service.ICustomerService;

import java.util.*;

public class CustomerService implements ICustomerService {
    private static final LinkedList<Customer> customerServiceList;
    static {
        customerServiceList = new LinkedList<>();
        Customer customer = new Customer();
    }

    @Override
    public void display() {
        for (Customer customer: customerServiceList){
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        Customer customer = new Customer();
        System.out.println("Enter customer information");
        customer.setIdName();
        customer.setName();
        customer.setAge();
        customer.setGender();
        customer.setNumberPhone();
        customer.setEmail();
        customer.setIdCode();
        customer.setRankCustomer();
        customer.setAddress();
        customerServiceList.add(customer);
    }

    @Override
    public void fix() {
        System.out.println("Enter Customer IDName need to fix: ");
        Scanner input = new Scanner(System.in);
        String idNameNeedFix = input.nextLine();
        if(checkIDName(idNameNeedFix)!=null){
            Objects.requireNonNull(checkIDName(idNameNeedFix)).setName();
            Objects.requireNonNull(checkIDName(idNameNeedFix)).setAge();
            Objects.requireNonNull(checkIDName(idNameNeedFix)).setGender();
            Objects.requireNonNull(checkIDName(idNameNeedFix)).setNumberPhone();
            Objects.requireNonNull(checkIDName(idNameNeedFix)).setEmail();
            Objects.requireNonNull(checkIDName(idNameNeedFix)).setIdCode();
            Objects.requireNonNull(checkIDName(idNameNeedFix)).setRankCustomer();
            Objects.requireNonNull(checkIDName(idNameNeedFix)).setAddress();
        }

    }

    @Override
    public void delete() {
        System.out.println("Enter Customer IDName need to delete: ");
        Scanner input = new Scanner(System.in);
        String idNameNeedDel = input.nextLine();
        if(checkIDName(idNameNeedDel)!=null){
            customerServiceList.remove(checkIDName(idNameNeedDel));
        }
    }
    private Customer checkIDName(String idNameNeedFix){
        for (Customer customer1: customerServiceList){
            if(idNameNeedFix.equals(customer1.getIdName())){
                return customer1;
            }
        }
        return null;
    }
}
