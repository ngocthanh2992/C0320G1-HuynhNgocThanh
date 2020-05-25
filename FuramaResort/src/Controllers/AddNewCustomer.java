package Controllers;

import Commons.FuncFileCSVCustomer;
import Models.Customer;

import java.util.ArrayList;
import java.util.Scanner;
import Exception.NameException;
import Exception.BirthdayException;
import Exception.GenderException;
import Exception.EmailException;
import Exception.IDException;

import static Controllers.MainController.displayMainMenu;

public class AddNewCustomer {
    public static void addNewCustomer() {
        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter Name: ");
                customer.setName(NameException.nameException(scanner.nextLine()));
                break;
            }catch (NameException e){
                System.out.println(e);
            }
        }

        while (true) {
            try {
                System.out.println("Enter Birthday: ");
                customer.setBirthday(BirthdayException.birthdayException(scanner.nextLine()));
                break;
            }catch (BirthdayException e){
                System.out.println(e);
            }
        }

        while (true) {
            try {
                System.out.println("Enter Gender: ");
                customer.setGender(GenderException.genderException(scanner.nextLine()));
                break;
            }catch (GenderException e){
                System.out.println(e);
            }

        }
        System.out.println("Enter Phone: ");
        customer.setPhone(Long.parseLong(scanner.nextLine()));

        while (true) {
            try {
                System.out.println("Enter Identity Card: ");
                customer.setIdentityCard(Long.parseLong(IDException.idCardException(scanner.nextLine())));
                break;
            }catch (IDException e){
                System.out.println(e);
            }

        }

        while (true) {
            try {
                System.out.println("Enter Email: ");
                customer.setEmail(EmailException.emailException(scanner.nextLine()));
                break;
            }catch (EmailException e){
                System.out.println(e);
            }
        }

        System.out.println("Enter Type Customer: ");
        customer.setTypeCustomer(scanner.nextLine());
        System.out.println("Enter Address: ");
        customer.setAddress(scanner.nextLine());
        System.out.println("Done. Enter to continue");
        scanner.nextLine();
        listCustomer.add(customer);
        FuncFileCSVCustomer.writeCustomerToFileCSV(listCustomer);
        displayMainMenu();
    }
}
