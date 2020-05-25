package Models;

public class AccompaniedService {
    public String nameService;
    public int unit;
    public int price;

    public AccompaniedService() {
    }

    public AccompaniedService(String nameService, int unit, int price) {
        this.nameService = nameService;
        this.unit = unit;
        this.price = price;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
