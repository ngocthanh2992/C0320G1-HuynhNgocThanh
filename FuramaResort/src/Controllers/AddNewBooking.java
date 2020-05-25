package Controllers;

import Commons.*;
import Models.Customer;
import Models.House;
import Models.Room;
import Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;

import static Controllers.ShowInformationCustomer.showInformationOfCustomer;

public class AddNewBooking {
    public static void addNewBooking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.\tBooking Villa");
        System.out.println("2.\tBooking House");
        System.out.println("3.\tBooking Room");
        System.out.println("4.\tExit");
        System.out.println("Enter a number: ");
        int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    ArrayList<Customer> listCustomer = new ArrayList<Customer>();
                    listCustomer = FuncFileCSVCustomer.getFileCsvToListCustomer();
                    for (int v =0; v< listCustomer.size();v++){
                        System.out.println("............................");
                        System.out.println("No."+(v+1));
                        System.out.println(listCustomer.get(v).toString());
                        System.out.println("............................");
                    }
                    System.out.println("Enter number of Customer");
                    int temp = Integer.parseInt(scanner.nextLine());
                    ArrayList<Villa> listVilla = new ArrayList<Villa>();
                    listVilla = FuncFileCSVVilla.getFileCsvToListVilla();
                    for (int i =0; i< listVilla.size();i++){
                        System.out.println("............................");
                        System.out.println("No."+(i+1));
                        System.out.println(listVilla.get(i).showInfor());
                        System.out.println("............................");
                    }
                    System.out.println("Enter number of Villa");
                    Villa villa = listVilla.get(Integer.parseInt(scanner.nextLine())-1);
                    listCustomer.get(temp-1).setServices(villa);
                    FuncFileCSVBooking.writeBookingToFileCSV(listCustomer.get(temp-1));
                    System.out.println("Done. Enter to continue");
                    scanner.nextLine();
                    addNewBooking();
                    break;
                case 2:
                    ArrayList<Customer> listCustomer1 = new ArrayList<Customer>();
                    listCustomer1 = FuncFileCSVCustomer.getFileCsvToListCustomer();
                    for (int v =0; v< listCustomer1.size();v++){
                        System.out.println("............................");
                        System.out.println("No."+(v+1));
                        System.out.println(listCustomer1.get(v).toString());
                        System.out.println("............................");
                    }
                    System.out.println("Enter number of Customer");
                    int temp1 = Integer.parseInt(scanner.nextLine());
                    ArrayList<House> listHouse = new ArrayList<House>();
                    listHouse = FuncFileCSVHouse.getFileCsvToListHouse();
                    for (int j =0; j< listHouse.size();j++){
                        System.out.println("............................");
                        System.out.println("No."+(j+1));
                        System.out.println(listHouse.get(j).showInfor());
                        System.out.println("............................");
                    }
                    System.out.println("Enter number of House");
                    House house = listHouse.get(Integer.parseInt(scanner.nextLine())-1);
                    listCustomer1.get(temp1-1).setServices(house);
                    FuncFileCSVBooking.writeBookingToFileCSV(listCustomer1.get(temp1-1));
                    System.out.println("Done. Enter to continue");
                    scanner.nextLine();
                    addNewBooking();
                    break;
                case 3:
                    ArrayList<Customer> listCustomer2 = new ArrayList<Customer>();
                    listCustomer2 = FuncFileCSVCustomer.getFileCsvToListCustomer();
                    for (int v =0; v< listCustomer2.size();v++){
                        System.out.println("............................");
                        System.out.println("No."+(v+1));
                        System.out.println(listCustomer2.get(v).toString());
                        System.out.println("............................");
                    }
                    System.out.println("Enter number of Customer");
                    int temp2 = Integer.parseInt(scanner.nextLine());
                    ArrayList<Room> listRoom = new ArrayList<Room>();
                    listRoom = FuncFileCSVRoom.getFileCsvToListRoom();
                    for (int z =0; z< listRoom.size();z++){
                        System.out.println("............................");
                        System.out.println("No."+(z+1));
                        System.out.println(listRoom.get(z).showInfor());
                        System.out.println("............................");
                    }
                    System.out.println("Enter number of House");
                    Room room = listRoom.get(Integer.parseInt(scanner.nextLine())-1);
                    listCustomer2.get(temp2-1).setServices(room);
                    FuncFileCSVBooking.writeBookingToFileCSV(listCustomer2.get(temp2-1));
                    System.out.println("Done. Enter to continue");
                    scanner.nextLine();
                    addNewBooking();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice! Enter to continue");
                    scanner.nextLine();
                    addNewBooking();
            }
        }
    }
