package module2.Furama.model;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private double area;
    private double price;
    private int numberOfPeople;
    private String styleRent;


    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, double area, double price, int numberOfPeople, String styleRent) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.area = area;
        this.price = price;
        this.numberOfPeople = numberOfPeople;
        this.styleRent = styleRent;

    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getStyleRent() {
        return styleRent;
    }

    public void setStyleRent(String styleRent) {
        this.styleRent = styleRent;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", numberOfPeople=" + numberOfPeople +
                ", styleRent='" + styleRent + '\'' +
                '}';
    }
}
