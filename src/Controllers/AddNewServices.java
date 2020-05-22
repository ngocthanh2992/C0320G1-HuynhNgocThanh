package Controllers;

import Commons.FuncFileCSVHouse;
import Commons.FuncFileCSVRoom;
import Commons.FuncFileCSVVilla;
import Commons.FuncValidate;
import Models.House;
import Models.Room;
import Models.Villa;
import javafx.beans.binding.When;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static Controllers.MainController.displayMainMenu;

public class AddNewServices {
    public static void addNewServices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.\tAdd New Villa");
        System.out.println("2.\tAdd New House");
        System.out.println("3.\tAdd New Room");
        System.out.println("4.\tBack to MainMenu");
        System.out.println("5.\tExit");
        System.out.println("Enter a number: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                ArrayList<Villa> listVilla = new ArrayList<Villa>();
                Villa villa = new Villa();
                System.out.println("Enter Service Code: ");
                String nameServiceCodeVila = scanner.nextLine();
                while (!FuncValidate.checkServiceCodeVilla(nameServiceCodeVila)){
                    System.out.println("Service code is invalid. Try again!");
                    nameServiceCodeVila = scanner.nextLine();
                }
                villa.setServiceCode(nameServiceCodeVila);

                System.out.println("Enter id: ");
                villa.setId(scanner.nextLine());

                System.out.println("Enter Name Service: ");
                String nameServiceVillaTemp = scanner.nextLine();
                while (!FuncValidate.checkNameService(nameServiceVillaTemp)) {
                    System.out.println("Name Service is invalid. Try again!");
                    nameServiceVillaTemp = scanner.nextLine();
                }
                villa.setNameService(nameServiceVillaTemp);

                System.out.println("Enter Area of Use: ");
                String nameAreaOfUseVilla = scanner.nextLine();
                while (!FuncValidate.checkArea(Integer.parseInt(nameAreaOfUseVilla))){
                    System.out.println("Area of use is invalid. Try again!");
                    nameAreaOfUseVilla = scanner.nextLine();
                }
                villa.setAreaOfUse(Integer.parseInt(nameAreaOfUseVilla));

                System.out.println("Enter Rental Cost: ");
                int rentalCostVilla = Integer.parseInt(scanner.nextLine());
                while (!FuncValidate.checkRentalCost(rentalCostVilla)){
                    System.out.println("Rental cost is invalid. Try again!");
                    rentalCostVilla = Integer.parseInt(scanner.nextLine());
                }
                villa.setRentalCost(rentalCostVilla);

                System.out.println("Enter Maximum People: ");
                int maximumPeopleVilla = Integer.parseInt(scanner.nextLine());
                while (!FuncValidate.checkPeople(maximumPeopleVilla)){
                    System.out.println("Maximum people is invalid. Try again!");
                    maximumPeopleVilla = Integer.parseInt(scanner.nextLine());
                }
                villa.setMaximumPeople(maximumPeopleVilla);

                System.out.println("Enter Type of Rent: ");
                String nameTypeOfRentVilla = scanner.nextLine();
                while (!FuncValidate.checkNameService(nameTypeOfRentVilla)) {
                    System.out.println("Name Service is invalid. Try again!");
                    nameTypeOfRentVilla = scanner.nextLine();
                }
                villa.setTypeOfRent(nameTypeOfRentVilla);

                System.out.println("Enter Room Standard: ");
                String nameRoomStandardVilla = scanner.nextLine();
                while (!FuncValidate.checkNameService(nameRoomStandardVilla)) {
                    System.out.println("Name Service is invalid. Try again!");
                    nameRoomStandardVilla = scanner.nextLine();
                }
                villa.setRoomStandard(nameRoomStandardVilla);

                System.out.println("Enter Other Facilities: ");
                villa.setOtherFacilities(scanner.nextLine());

                System.out.println("Enter Pool Area: ");
                String namePoolAreaVilla = scanner.nextLine();
                while (!FuncValidate.checkArea(Integer.parseInt(namePoolAreaVilla))){
                    System.out.println("Area of use is invalid. Try again!");
                    namePoolAreaVilla = scanner.nextLine();
                }
                villa.setPoolArea(Integer.parseInt(namePoolAreaVilla));

                System.out.println("Enter Number of Floor: ");
                int numberOfFloorVilla = Integer.parseInt(scanner.nextLine());
                while (!FuncValidate.checkRentalCost(numberOfFloorVilla)){
                    System.out.println("Rental cost is invalid. Try again!");
                    numberOfFloorVilla = Integer.parseInt(scanner.nextLine());
                }
                villa.setNumberOfFloor(numberOfFloorVilla);
                System.out.println("Done. Enter to continue");
                scanner.nextLine();
                listVilla.add(villa);
                FuncFileCSVVilla.writeVillaToFileCSV(listVilla);
                addNewServices();
                break;
            case 2:
                ArrayList<House> listHouse = new ArrayList<House>();
                House house = new House();
                System.out.println("Enter Service Code: ");
                String nameServiceCodeHouse = scanner.nextLine();
                while (!FuncValidate.checkServiceCodeHouse(nameServiceCodeHouse)){
                    System.out.println("Service code is invalid. Try again!");
                    nameServiceCodeHouse = scanner.nextLine();
                }
                house.setServiceCode(nameServiceCodeHouse);

                System.out.println("Enter id: ");
                house.setId(scanner.nextLine());

                System.out.println("Enter Name Service: ");
                String nameServiceHouseTemp = scanner.nextLine();
                while (!FuncValidate.checkNameService(nameServiceHouseTemp)){
                    System.out.println("Name Service is invalid. Try again!");
                    nameServiceHouseTemp = scanner.nextLine();
                }
                house.setNameService(nameServiceHouseTemp);

                System.out.println("Enter Area of Use: ");
                String nameAreaOfUseHouse = scanner.nextLine();
                while (!FuncValidate.checkArea(Integer.parseInt(nameAreaOfUseHouse))){
                    System.out.println("Area of use is invalid. Try again!");
                    nameAreaOfUseHouse = scanner.nextLine();
                }
                house.setAreaOfUse(Integer.parseInt(nameAreaOfUseHouse));

                System.out.println("Enter Rental Cost: ");
                int rentalCostHouse = Integer.parseInt(scanner.nextLine());
                while (!FuncValidate.checkRentalCost(rentalCostHouse)){
                    System.out.println("Rental cost is invalid. Try again!");
                    rentalCostHouse = Integer.parseInt(scanner.nextLine());
                }
                house.setRentalCost(rentalCostHouse);

                System.out.println("Enter Maximum People: ");
                int maximumPeopleHouse = Integer.parseInt(scanner.nextLine());
                while (!FuncValidate.checkPeople(maximumPeopleHouse)){
                    System.out.println("Maximum people is invalid. Try again!");
                    maximumPeopleHouse = Integer.parseInt(scanner.nextLine());
                }
                house.setMaximumPeople(maximumPeopleHouse);

                System.out.println("Enter Type of Rent: ");
                String nameTypeOfRentHouse = scanner.nextLine();
                while (!FuncValidate.checkNameService(nameTypeOfRentHouse)){
                    System.out.println("Name Service is invalid. Try again!");
                    nameTypeOfRentHouse = scanner.nextLine();
                }
                house.setTypeOfRent(nameTypeOfRentHouse);

                System.out.println("Enter Room Standard: ");
                String nameRoomStandardHouse = scanner.nextLine();
                while (!FuncValidate.checkNameService(nameRoomStandardHouse)){
                    System.out.println("Name Service is invalid. Try again!");
                    nameRoomStandardHouse = scanner.nextLine();
                }
                house.setRoomStandard(nameRoomStandardHouse);

                System.out.println("Enter Other Facilities: ");
                house.setOtherFacilities(scanner.nextLine());

                System.out.println("Enter Pool Area: ");
                String namePoolAreaHouse = scanner.nextLine();
                while (!FuncValidate.checkArea(Integer.parseInt(namePoolAreaHouse))){
                    System.out.println("Area of use is invalid. Try again!");
                    namePoolAreaHouse = scanner.nextLine();
                }
                house.setPoolArea(Integer.parseInt(namePoolAreaHouse));

                System.out.println("Enter Number of Floor: ");
                int numberOfFloorHouse = Integer.parseInt(scanner.nextLine());
                while (!FuncValidate.checkRentalCost(numberOfFloorHouse)){
                    System.out.println("Rental cost is invalid. Try again!");
                    numberOfFloorHouse = Integer.parseInt(scanner.nextLine());
                }
                house.setNumberOfFloor(numberOfFloorHouse);

                System.out.println("Done. Enter to continue");
                scanner.nextLine();
                listHouse.add(house);
                FuncFileCSVHouse.writeHouseToFileCSV(listHouse);
                addNewServices();
                break;
            case 3:
                ArrayList<Room> listRoom = new ArrayList<Room>();
                Room room = new Room();
                System.out.println("Enter Service Code: ");
                String nameServiceCodeRoom = scanner.nextLine();
                while (!FuncValidate.checkServiceCodeRoom(nameServiceCodeRoom)){
                    System.out.println("Service code is invalid. Try again!");
                    nameServiceCodeRoom = scanner.nextLine();
                }
                room.setServiceCode(nameServiceCodeRoom);

                System.out.println("Enter id: ");
                room.setId(scanner.nextLine());

                System.out.println("Enter Name Service: ");
                String nameServiceRoomTemp = scanner.nextLine();
                while (!FuncValidate.checkNameService(nameServiceRoomTemp)){
                    System.out.println("Name Service is invalid. Try again!");
                    nameServiceRoomTemp = scanner.nextLine();
                }
                room.setNameService(nameServiceRoomTemp);

                System.out.println("Enter Area of Use: ");
                String nameAreaOfUseRoom = scanner.nextLine();
                while (!FuncValidate.checkArea(Integer.parseInt(nameAreaOfUseRoom))){
                    System.out.println("Area of use is invalid. Try again!");
                    nameAreaOfUseRoom = scanner.nextLine();
                }
                room.setAreaOfUse(Integer.parseInt(nameAreaOfUseRoom));

                System.out.println("Enter Rental Cost: ");
                int rentalCostRoom = Integer.parseInt(scanner.nextLine());
                while (!FuncValidate.checkRentalCost(rentalCostRoom)){
                    System.out.println("Rental cost is invalid. Try again!");
                    rentalCostRoom = Integer.parseInt(scanner.nextLine());
                }
                room.setRentalCost(rentalCostRoom);

                System.out.println("Enter Maximum People: ");
                int maximumPeopleRoom = Integer.parseInt(scanner.nextLine());
                while (!FuncValidate.checkPeople(maximumPeopleRoom)){
                    System.out.println("Maximum people is invalid. Try again!");
                    maximumPeopleRoom = Integer.parseInt(scanner.nextLine());
                }
                room.setMaximumPeople(maximumPeopleRoom);

                System.out.println("Enter Type of Rent: ");
                String nameTypeOfRentRoom = scanner.nextLine();
                while (!FuncValidate.checkNameService(nameTypeOfRentRoom)){
                    System.out.println("Name Service is invalid. Try again!");
                    nameTypeOfRentRoom = scanner.nextLine();
                }
                room.setTypeOfRent(nameTypeOfRentRoom);

                System.out.println("Enter Free Service: ");
                room.setFreeSerivce(scanner.nextLine());
                System.out.println("Done. Enter to continue");
                scanner.nextLine();
                listRoom.add(room);
                FuncFileCSVRoom.writeRoomToFileCSV(listRoom);
                addNewServices();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Failed. Enter to continue");
                scanner.nextLine();
                addNewServices();
        }
    }
}
