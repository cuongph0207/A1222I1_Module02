package module2.furama_resort.model;

public class Villa extends Facility {
    private String standardRoom;
    private double poolArea;
    private int numFloor;

    public Villa(String serviceID, String serviceName, double area, double cost, int maxUse, String styleRent, String standardRoom, double poolArea, int numFloor) {
        super(serviceID, serviceName, area, cost, maxUse, styleRent);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.numFloor = numFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", poolArea=" + poolArea +
                ", numFloor=" + numFloor +
                '}';
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }


}
