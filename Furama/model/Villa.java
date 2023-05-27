package module2.Furama.model;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;

    private int floor;

    public Villa() {
    }

    public Villa(String roomStandard, double poolArea, int floor) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(String serviceCode, String serviceName, double area, double price, int numberOfPeople, String styleRent, String roomStandard, double poolArea, int floor) {
        super(serviceCode, serviceName, area, price, numberOfPeople, styleRent);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                '}';
    }
}

