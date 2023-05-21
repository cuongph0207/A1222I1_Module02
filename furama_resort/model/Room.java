package module2.furama_resort.model;

public class Room extends Facility{
    public Room(String nameService, double area, double cost, int maxUse, String styleRent) {
        super(nameService, area, cost, maxUse, styleRent);
    }
    private String freeService;

    public Room(String nameService, double area, double cost, int maxUse, String styleRent, String freeService) {
        super(nameService, area, cost, maxUse, styleRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}