package Controllers;

import Commons.FuncFileCSVVilla;
import Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;

import static Controllers.AddNewBooking.addNewBooking;
import static Controllers.AddNewCustomer.addNewCustomer;
import static Controllers.AddNewServices.addNewServices;
import static Controllers.FindInformationOfEmployee.findInformationOfEmployee;
import static Controllers.ShowInformationCustomer.showInformationOfCustomer;
import static Controllers.ShowInformationEmployee.showInformationOfEmployee;
import static Controllers.ShowInformationOf4D.showInformationOf4D;
import static Controllers.ShowServices.showServices;

public class MainController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.\tAdd New Services");
        System.out.println("2.\tShow Services");
        System.out.println("3.\tAdd New Customer");
        System.out.println("4.\tShow Information of Customer");
        System.out.println("5.\tAdd New Booking");
        System.out.println("6.\tShow Information of Employee");
        System.out.println("7.\tShow Information of 4D");
        System.out.println("8.\tFind Information of Employee");
        System.out.println("9.\tExit");
        System.out.println("Enter a number: ");
        int choice = Integer.parseInt(scanner.nextLine());
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
                    showInformationOf4D();
                    break;
                case 8:
                    findInformationOfEmployee();
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("No choice! Enter to continue");
                    scanner.nextLine();
                    displayMainMenu();
            }
        }

    public static void main(String[] args) {
            displayMainMenu();
    }
}
