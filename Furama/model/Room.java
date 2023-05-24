package module2.Furama.model;

public class Room extends Facility  {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceCode, String serviceName, double price, int numberOfPeople, String styleRent, double area, String freeService) {
        super(serviceCode, serviceName, price, numberOfPeople, styleRent, area);
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

