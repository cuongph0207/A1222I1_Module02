package module2.furama_resort.model;

public class Room extends Facility {
    private String freeService;

    public Room(String serviceID, String serviceName, double area, double cost, int maxUse, String styleRent, String freeService) {
        super(serviceID, serviceName, area, cost, maxUse, styleRent);
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

}