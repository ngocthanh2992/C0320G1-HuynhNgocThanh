package Controllers;

import Commons.FuncFileCSVCustomer;
import Models.Customer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

import static Controllers.MainController.displayMainMenu;

public class ShowInformationOf4D {
    public static void showInformationOf4D() {
        Scanner scanner =new Scanner(System.in);
        ArrayList<Customer> listCustomer = new ArrayList<>();
        listCustomer = FuncFileCSVCustomer.getFileCsvToListCustomer();
        Queue<String> queue = new ArrayDeque<>(4);
        int i = 0;
        for (Customer customer : listCustomer) {
            i++;
            queue.add(customer.getName());
            if (i > 3) {
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("List of customer: ");
                while (queue.peek() != null) {
                    System.out.println("Position: " + queue.remove());
                }
                System.out.println("--------------------------------------------------------------------------");
                break;
            }
        }
        System.out.println("Enter to continue");
        scanner.nextLine();
        displayMainMenu();
    }
}
