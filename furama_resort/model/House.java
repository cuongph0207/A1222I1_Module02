package module2.furama_resort.model;

public class House extends Facility {
    private String standardRoom;
    private int numFloor;

    public House(String serviceID, String serviceName, double area, double cost, int maxUse, String styleRent, String standardRoom, int numFloor) {
        super(serviceID, serviceName, area, cost, maxUse, styleRent);
        this.standardRoom = standardRoom;
        this.numFloor = numFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", numFloor=" + numFloor +
                '}';
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }

}
