package Models;

public class House extends Services {
    private String roomStandard;
    private String otherFacilities;
    private int poolArea;
    private int numberOfFloor;

    public House() {
    }

    public House(String serviceCode,String id, String nameService, int areaOfUse, int rentalCost, int maximumPeople, String typeOfRent, String roomStandard, String otherFacilities, int poolArea, int numberOfFloor) {
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
}
