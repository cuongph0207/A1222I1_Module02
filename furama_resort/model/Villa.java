package module2.furama_resort.model;

public class Villa extends Facility{
    public Villa(String nameService, double area, double cost, int maxUse, String styleRent) {
        super(nameService, area, cost, maxUse, styleRent);
    }
    private String standardRoom;
    private double poolArea;
    private int numFloor;

    public Villa(String nameService, double area, double cost, int maxUse, String styleRent, String standardRoom, double poolArea, int numFloor) {
        super(nameService, area, cost, maxUse, styleRent);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.numFloor = numFloor;
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

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", poolArea=" + poolArea +
                ", numFloor=" + numFloor +
                '}';
    }
}
