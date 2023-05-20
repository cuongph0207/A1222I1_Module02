package module2.furama_resort.model;

public abstract class Facility {
    private String nameService;
    private double area;
    private double cost;
    private int maxUse;
    private String styleRent;

    public Facility(String nameService) {
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
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

    public int getMaxUse() {
        return maxUse;
    }

    public void setMaxUse(int maxUse) {
        this.maxUse = maxUse;
    }

    public String getStyleRent() {
        return styleRent;
    }

    public void setStyleRent(String styleRent) {
        this.styleRent = styleRent;
    }

    public Facility(String nameService, double area, double cost, int maxUse, String styleRent) {
        this.nameService = nameService;
        this.area = area;
        this.cost = cost;
        this.maxUse = maxUse;
        this.styleRent = styleRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", maxUse=" + maxUse +
                ", styleRent='" + styleRent + '\'' +
                '}';
    }
}
