package Models;

import java.util.Objects;

public class Villa extends Services implements Comparable<Villa>{
    private String roomStandard;
    private String otherFacilities;
    private int poolArea;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(String serviceCode,String id, String nameService, int areaOfUse, int rentalCost, int maximumPeople, String typeOfRent, String roomStandard, String otherFacilities, int poolArea, int numberOfFloor) {
        super(serviceCode,id, nameService, areaOfUse, rentalCost, maximumPeople, typeOfRent);
        this.roomStandard = roomStandard;
        this.otherFacilities = otherFacilities;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherFacilities() {
        return otherFacilities;
    }

    public void setOtherFacilities(String otherFacilities) {
        this.otherFacilities = otherFacilities;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String showInfor() {
       return super.toString() +
               ", roomStandard='" + roomStandard + '\'' +
               ", otherFacilities='" + otherFacilities + '\'' +
               ", poolArea='" + poolArea + '\'' +
               ", numberOfFloor=" + numberOfFloor +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Villa villa = (Villa) o;
        return poolArea == villa.poolArea &&
                numberOfFloor == villa.numberOfFloor &&
                roomStandard.equals(villa.roomStandard) &&
                otherFacilities.equals(villa.otherFacilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), roomStandard, otherFacilities, poolArea, numberOfFloor);
    }

    @Override
    public int compareTo(Villa o) {
        return this.getNameService().compareTo(o.getNameService());
    }
}
