package Models;

public class Room extends Services {
    private String freeServce;

    public Room() {
    }

    public Room(String id, String nameService, int areaOfUse, int rentalCost, int maximumPeople, String typeOfRent, String freeServce) {
        super(id, nameService, areaOfUse, rentalCost, maximumPeople, typeOfRent);
        this.freeServce = freeServce;
    }

    public String getFreeServce() {
        return freeServce;
    }

    public void setFreeServce(String freeServce) {
        this.freeServce = freeServce;
    }

    @Override
    public String showInfor() {
        return super.toString()+
                ", freeServce=" + freeServce +
                '}';
    }
}
