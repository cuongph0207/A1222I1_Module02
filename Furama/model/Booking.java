package module2.Furama.model;

import java.util.Date;

public class Booking {
    private String bookingCode;
    private Date bookingDay;
    private Date checkIn;
    private Date checkOut;
    private String customerId;
    private String service;

    public Booking() {
    }

    public Booking(String bookingCode, Date bookingDay, Date checkIn, Date checkOut, String customerId, String service) {
        this.bookingCode = bookingCode;
        this.bookingDay = bookingDay;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.customerId = customerId;
        this.service = service;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public Date getBookingDay() {
        return bookingDay;
    }

    public void setBookingDay(Date bookingDay) {
        this.bookingDay = bookingDay;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", bookingDay=" + bookingDay +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", customerId='" + customerId + '\'' +
                ", service='" + service + '\'' +
                '}';
    }
}


