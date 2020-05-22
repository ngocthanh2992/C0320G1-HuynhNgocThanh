package Controllers;

import Commons.FuncFileCSVHouse;
import Commons.FuncFileCSVRoom;
import Commons.FuncFileCSVVilla;
import Models.House;
import Models.Room;
import Models.Villa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import static Controllers.MainController.displayMainMenu;

public class ShowServices {
    public static void showServices() {
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        ArrayList<House> listHouse = new ArrayList<House>();
        ArrayList<Room> listRoom = new ArrayList<Room>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.\tShow all Villa");
        System.out.println("2.\tShow all House");
        System.out.println("3.\tShow all Room");
        System.out.println("4.\tShow All Name Villa Not Duplicate");
        System.out.println("5.\tShow All Name House Not Duplicate");
        System.out.println("6.\tShow All Name Room Not Duplicate");
        System.out.println("7.\tBack to MainMenu");
        System.out.println("8.\tExit");
        System.out.println("Enter a number: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                listVilla = FuncFileCSVVilla.getFileCsvToListVilla();
                for (Villa villa: listVilla){
                    System.out.println("............................");
                    System.out.println("Service code: "+ villa.getServiceCode());
                    System.out.println("ID: "+ villa.getId());
                    System.out.println("Name Service: "+ villa.getNameService());
                    System.out.println("Area of use: "+ villa.getAreaOfUse());
                    System.out.println("Rental cost: "+ villa.getRentalCost());
                    System.out.println("Maximum people: "+ villa.getMaximumPeople());
                    System.out.println("Type of rent: "+ villa.getTypeOfRent());
                    System.out.println("Room Standard: "+ villa.getRoomStandard());
                    System.out.println("Other Facilities: "+ villa.getOtherFacilities());
                    System.out.println("Pool area: "+ villa.getPoolArea());
                    System.out.println("Number of floor: "+ villa.getNumberOfFloor());
                    System.out.println("............................");
                }
                System.out.println("Enter to continue");
                scanner.nextLine();
                showServices();
                break;
            case 2:
                listHouse = FuncFileCSVHouse.getFileCsvToListHouse();
                for (House house: listHouse){
                    System.out.println("............................");
                    System.out.println("Service code: "+ house.getServiceCode());
                    System.out.println("ID: "+ house.getId());
                    System.out.println("Name Service: "+ house.getNameService());
                    System.out.println("Area of use: "+ house.getAreaOfUse());
                    System.out.println("Rental cost: "+ house.getRentalCost());
                    System.out.println("Maximum people: "+ house.getMaximumPeople());
                    System.out.println("Type of rent: "+ house.getTypeOfRent());
                    System.out.println("Room Standard: "+ house.getRoomStandard());
                    System.out.println("Other Facilities: "+ house.getOtherFacilities());
                    System.out.println("Pool area: "+ house.getPoolArea());
                    System.out.println("Number of floor: "+ house.getNumberOfFloor());
                    System.out.println("............................");
                }
                System.out.println("Enter to continue");
                scanner.nextLine();
                showServices();
                break;
            case 3:
                listRoom = FuncFileCSVRoom.getFileCsvToListRoom();
                for (Room room: listRoom){
                    System.out.println("............................");
                    System.out.println("Service code: "+ room.getServiceCode());
                    System.out.println("ID: "+ room.getId());
                    System.out.println("Name Service: "+ room.getNameService());
                    System.out.println("Area of use: "+ room.getAreaOfUse());
                    System.out.println("Rental cost: "+ room.getRentalCost());
                    System.out.println("Maximum people: "+ room.getMaximumPeople());
                    System.out.println("Type of rent: "+ room.getTypeOfRent());
                    System.out.println("Room Free Service: "+ room.getFreeService());
                    System.out.println("............................");
                }
                System.out.println("Enter to continue");
                scanner.nextLine();
                showServices();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("Failed. Enter to continue");
                scanner.nextLine();
                showServices();
        }
    }
}
