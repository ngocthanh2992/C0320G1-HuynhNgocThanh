package Controllers;

import Commons.FuncFileCSVCustomer;
import Commons.NameCustomerComparator;
import Models.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.Scanner;

import static Controllers.MainController.displayMainMenu;
import Exception.NameException;

public class ShowInformationCustomer {
    public static void showInformationOfCustomer() {
        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
        Scanner scanner = new Scanner(System.in);
        listCustomer = FuncFileCSVCustomer.getFileCsvToListCustomer();
        Collections.sort(listCustomer,new NameCustomerComparator());
        for (Customer customer: listCustomer){
            System.out.println("............................");
            System.out.println("Name: "+ customer.getName());
            System.out.println("Birthday: "+ customer.getBirthday());
            System.out.println("Gender: "+ customer.isGender());
            System.out.println("Phone: "+ customer.getPhone());
            System.out.println("Identity Card: "+ customer.getPhone());
            System.out.println("Email: "+ customer.getEmail());
            System.out.println("Type Customer: "+ customer.getTypeCustomer());
            System.out.println("Address: "+ customer.getAddress());
            System.out.println("............................");
        }
        System.out.println("Enter to continue");
        scanner.nextLine();
        displayMainMenu();
    }
}
