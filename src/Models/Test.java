package Models;

public class Test {
    public static void main(String[] args) {
        Villa villa = new Villa();
        villa.setId("1");
        villa.setNumberOfFloor(2);
        villa.setPoolArea(25);
        villa.setOtherFacilities("Có gối ôm");
        villa.setRoomStandard("vip");
        villa.setAreaOfUse(40);
        villa.setMaximumPeople(10);
        villa.setNameService("Ss");
        villa.setRentalCost(50);
        villa.setTypeOfRent("13");
        System.out.println(villa.showInfor());
    }
}
