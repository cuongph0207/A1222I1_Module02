package module2.furama_resort.model;

public abstract class Facility {
    private String serviceID;

    private String serviceName;
    private double area;
    private double cost;
    private int max;
    private String styleRent;

    public Facility(String nameService) {
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getStyleRent() {
        return styleRent;
    }

    public void setStyleRent(String styleRent) {
        this.styleRent = styleRent;
    }

    public Facility() {
    }

    public Facility(String serviceID, String serviceName, double area, double cost, int maxUse, String styleRent) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.area = area;
        this.cost = cost;
        this.max = max;
        this.styleRent = styleRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceID='" + serviceID + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", max=" + max +
                ", styleRent='" + styleRent + '\'' +
                '}';
    }
}
