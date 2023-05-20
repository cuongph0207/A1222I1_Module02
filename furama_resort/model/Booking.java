package module2.furama_resort.model;

import java.util.Date;

public class Booking extends Facility {
    private String idBooking;
    private Date bookingDay;
    private Date startDay;
    private Date endDay;
    private String categoryService;

    public Booking() {
    }

    public Booking(String nameService, String idBooking, Date bookingDay, Date startDay, Date endDay, String categoryService) {
        super(nameService);
        this.idBooking = idBooking;
        this.bookingDay = bookingDay;
        this.startDay = startDay;
        this.endDay = endDay;
        this.categoryService = categoryService;
    }

    public Booking(String serviceID, String serviceName, double area, double cost, int maxUse, String styleRent, String idBooking, Date bookingDay, Date startDay, Date endDay, String categoryService) {
        super(serviceID, serviceName, area, cost, maxUse, styleRent);
        this.idBooking = idBooking;
        this.bookingDay = bookingDay;
        this.startDay = startDay;
        this.endDay = endDay;
        this.categoryService = categoryService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public Date getBookingDay() {
        return bookingDay;
    }

    public void setBookingDay(Date bookingDay) {
        this.bookingDay = bookingDay;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    public String getCategoryService() {
        return categoryService;
    }

    public void setCategoryService(String categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", bookingDay=" + bookingDay +
                ", startDay=" + startDay +
                ", endDay=" + endDay +
                ", categoryService='" + categoryService + '\'' +
                '}';
    }
}
