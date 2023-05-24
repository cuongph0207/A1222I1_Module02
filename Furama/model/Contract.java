package module2.Furama.model;

public class Contract {
    private String contractCode;
    private String bookingCode;
    private double deposit;
    private double totalBookingValue;

    public Contract() {
    }

    public Contract(String contractCode, String bookingCode, double deposit, double totalBookingValue) {
        this.contractCode = contractCode;
        this.bookingCode = bookingCode;
        this.deposit = deposit;
        this.totalBookingValue = totalBookingValue;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalBookingValue() {
        return totalBookingValue;
    }

    public void setTotalBookingValue(double totalBookingValue) {
        this.totalBookingValue = totalBookingValue;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractCode='" + contractCode + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", deposit=" + deposit +
                ", totalBookingValue=" + totalBookingValue +
                '}';
    }
}
