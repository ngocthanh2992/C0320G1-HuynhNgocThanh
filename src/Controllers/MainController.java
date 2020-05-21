package Controllers;

import Commons.FuncFileCSVVilla;
import Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    private static ArrayList<Villa> listVilla = new ArrayList<Villa>();
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.\tAdd New Services");
        System.out.println("2.\tShow Services");
        System.out.println("3.\tAdd New Customer");
        System.out.println("4.\tShow Information of Customer");
        System.out.println("5.\tAdd New Booking");
        System.out.println("6.\tShow Information of Employee");
        System.out.println("7.\tExit");
        System.out.println("Enter a number: ");
        int choice = Integer.parseInt(scanner.nextLine());
        while (true) {
            switch (choice) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationOfCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInformationOfEmployee();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("No choice! Enter to continue");
                    scanner.nextLine();
                    displayMainMenu();
            }
        }
    }

    private static void showInformationOfEmployee() {
    }

    private static void addNewBooking() {
    }

    private static void showInformationOfCustomer() {
    }

    private static void addNewCustomer() {
    }

    private static void showServices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.\tShow all Villa");
        System.out.println("2.\tShow all House");
        System.out.println("3.\tShow all Room");
        System.out.println("4.\tShow All Name Villa Not Duplicate");
        System.out.println("5.\tShow All Name House Not Duplicate");
        System.out.println("6.\tShow All Name Room Not Duplicate");
        System.out.println("7.\tBack to menu");
        System.out.println("8.\tExit");
        System.out.println("Enter a number: ");
        int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    listVilla = FuncFileCSVVilla.getFileCsvToListVilla();
                    for (Villa villa: listVilla){
                        System.out.println("............................");
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
                    break;
                case 2:
                    break;
                case 3:
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

    private static void addNewServices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.\tAdd New Villa");
        System.out.println("2.\tAdd New House");
        System.out.println("3.\tAdd New Room");
        System.out.println("4.\tBack to menu");
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
                    break;
                case 3:
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

    public static void main(String[] args) {
        displayMainMenu();
    }
}
