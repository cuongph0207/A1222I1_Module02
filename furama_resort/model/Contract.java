package module2.furama_resort.model;

import java.util.Date;

public class Contract extends Booking{
    private int numContract;
    private int deposit;
    private int totalCost;
    private String idCustomer;

    public Contract() {
    }

    public Contract(String nameService, String idBooking, Date bookingDay, Date startDay, Date endDay, String categoryService, int numContract, int deposit, int totalCost, String idCustomer) {
        super(nameService, idBooking, bookingDay, startDay, endDay, categoryService);
        this.numContract = numContract;
        this.deposit = deposit;
        this.totalCost = totalCost;
        this.idCustomer = idCustomer;
    }

    public Contract(String serviceID, String serviceName, double area, double cost, int maxUse, String styleRent, String idBooking, Date bookingDay, Date startDay, Date endDay, String categoryService, int numContract, int deposit, int totalCost, String idCustomer) {
        super(serviceID, serviceName, area, cost, maxUse, styleRent, idBooking, bookingDay, startDay, endDay, categoryService);
        this.numContract = numContract;
        this.deposit = deposit;
        this.totalCost = totalCost;
        this.idCustomer = idCustomer;
    }

    public int getNumContract() {
        return numContract;
    }

    public void setNumContract(int numContract) {
        this.numContract = numContract;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numContract=" + numContract +
                ", deposit=" + deposit +
                ", totalCost=" + totalCost +
                ", idCustomer='" + idCustomer + '\'' +
                '}';
    }
}
