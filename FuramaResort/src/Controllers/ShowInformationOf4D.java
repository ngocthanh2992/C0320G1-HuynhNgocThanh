package Controllers;

import Commons.FuncFileCSVCustomer;
import Models.Customer;
import Models.Employee;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ShowInformationOf4D {
    public static void showInformationOf4D() {
        ArrayList<Customer> listCustomer = new ArrayList<>();
        listCustomer = FuncFileCSVCustomer.getFileCsvToListCustomer();
        Queue<Customer> queue = new ArrayDeque<>();
        int i = 0;
        for (Customer customer : listCustomer) {
            queue.add(customer);
        }
        while (true){
            queue.poll().toString();
        }
    }
}
