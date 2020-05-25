package Models;

public abstract class Services {
    private String serviceCode;
    private String id;
    private String nameService;
    private int areaOfUse;
    private int rentalCost;
    private int maximumPeople;
    private String typeOfRent;

    public Services() {
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public Services(String serviceCode, String id, String nameService, int areaOfUse, int rentalCost, int maximumPeople, String typeOfRent) {
        this.serviceCode = serviceCode;
        this.id = id;
        this.nameService = nameService;
        this.areaOfUse = areaOfUse;
        this.rentalCost = rentalCost;
        this.maximumPeople = maximumPeople;
        this.typeOfRent = typeOfRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getAreaOfUse() {
        return areaOfUse;
    }

    public void setAreaOfUse(int areaOfUse) {
        this.areaOfUse = areaOfUse;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    public abstract String showInfor();

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaOfUse=" + areaOfUse +
                ", rentalCost=" + rentalCost +
                ", maximumPeople=" + maximumPeople +
                ", typeOfRent='" + typeOfRent + '\'' +
                '}';
    }
}
