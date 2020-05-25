package Models;

import java.util.Objects;

public class Room extends Services implements Comparable<Room>{
    private String freeServce;

    public Room() {
    }

    public Room(String serviceCode,String id, String nameService, int areaOfUse, int rentalCost, int maximumPeople, String typeOfRent, String freeServce) {
        super(serviceCode,id, nameService, areaOfUse, rentalCost, maximumPeople, typeOfRent);
        this.freeServce = freeServce;
    }

    public String getFreeService() {
        return freeServce;
    }

    public void setFreeSerivce(String freeServce) {
        this.freeServce = freeServce;
    }

    @Override
    public String showInfor() {
        return super.toString()+
                ", freeServce=" + freeServce +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Room room = (Room) o;
        return freeServce.equals(room.freeServce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), freeServce);
    }

    @Override
    public int compareTo(Room o) {
        return this.getNameService().compareTo(o.getNameService());
    }
}
