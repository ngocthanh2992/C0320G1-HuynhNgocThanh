package Controllers;

import Commons.FuncFileCSVHouse;
import Commons.FuncFileCSVRoom;
import Commons.FuncFileCSVVilla;
import Models.House;
import Models.Room;
import Models.Villa;

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
        while (true){
            switch (choice){
                case 1:
                    ArrayList<Villa> listVilla = new ArrayList<Villa>();
                    Villa villa = new Villa();
                    System.out.println("Enter id: ");
                    villa.setId(scanner.nextLine());
                    System.out.println("Enter Name Service: ");
                    villa.setNameService(scanner.nextLine());
                    System.out.println("Enter Area of Use: ");
                    villa.setAreaOfUse(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter Rental Cost: ");
                    villa.setRentalCost(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter Maximum People: ");
                    villa.setMaximumPeople(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter Type of Rent: ");
                    villa.setTypeOfRent(scanner.nextLine());
                    System.out.println("Enter Room Standard: ");
                    villa.setRoomStandard(scanner.nextLine());
                    System.out.println("Enter Other Facilities: ");
                    villa.setOtherFacilities(scanner.nextLine());
                    System.out.println("Enter Pool Area: ");
                    villa.setPoolArea(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter Number of Floor: ");
                    villa.setNumberOfFloor(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Done. Enter to continue");
                    scanner.nextLine();
                    listVilla.add(villa);
                    FuncFileCSVVilla.writeVillaToFileCSV(listVilla);
                    addNewServices();
                    break;
                case 2:
                    ArrayList<House> listHouse = new ArrayList<House>();
                    House house = new House();
                    System.out.println("Enter id: ");
                    house.setId(scanner.nextLine());
                    System.out.println("Enter Name Service: ");
                    house.setNameService(scanner.nextLine());
                    System.out.println("Enter Area of Use: ");
                    house.setAreaOfUse(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter Rental Cost: ");
                    house.setRentalCost(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter Maximum People: ");
                    house.setMaximumPeople(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter Type of Rent: ");
                    house.setTypeOfRent(scanner.nextLine());
                    System.out.println("Enter Room Standard: ");
                    house.setRoomStandard(scanner.nextLine());
                    System.out.println("Enter Other Facilities: ");
                    house.setOtherFacilities(scanner.nextLine());
                    System.out.println("Enter Pool Area: ");
                    house.setPoolArea(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter Number of Floor: ");
                    house.setNumberOfFloor(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Done. Enter to continue");
                    scanner.nextLine();
                    listHouse.add(house);
                    FuncFileCSVHouse.writeHouseToFileCSV(listHouse);
                    addNewServices();
                    break;
                case 3:
                    ArrayList<Room> listRoom = new ArrayList<Room>();
                    Room room = new Room();
                    System.out.println("Enter id: ");
                    room.setId(scanner.nextLine());
                    System.out.println("Enter Name Service: ");
                    room.setNameService(scanner.nextLine());
                    System.out.println("Enter Area of Use: ");
                    room.setAreaOfUse(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter Rental Cost: ");
                    room.setRentalCost(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter Maximum People: ");
                    room.setMaximumPeople(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter Type of Rent: ");
                    room.setTypeOfRent(scanner.nextLine());
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
}
