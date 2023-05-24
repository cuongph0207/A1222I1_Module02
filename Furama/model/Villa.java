package module2.Furama.model;

public class Villa extends Facility {
    private String roomStandard;
    private int floor;
    private double poolArea;

    public Villa() {
    }

    public Villa(String roomStandard, int floor, double poolArea) {
        this.roomStandard = roomStandard;
        this.floor = floor;
        this.poolArea = poolArea;
    }

    public Villa(String serviceCode, String serviceName, double price, int numberOfPeople, String styleRent, double area, String roomStandard, int floor, double poolArea) {
        super(serviceCode, serviceName, price, numberOfPeople, styleRent, area);
        this.roomStandard = roomStandard;
        this.floor = floor;
        this.poolArea = poolArea;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", floor=" + floor +
                ", poolArea=" + poolArea +
                '}';
    }
}
