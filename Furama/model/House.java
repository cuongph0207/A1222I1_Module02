package module2.Furama.model;

public class House extends Facility  {
    private String roomStandard;
    private int floor;

    public House() {
    }

    public House(String roomStandard, int floor) {
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public House(String serviceCode, String serviceName, double price, int numberOfPeople, String styleRent, double area, String roomStandard, int floor) {
        super(serviceCode, serviceName, price, numberOfPeople, styleRent, area);
        this.roomStandard = roomStandard;
        this.floor = floor;
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

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", floor=" + floor +
                '}';
    }
}
