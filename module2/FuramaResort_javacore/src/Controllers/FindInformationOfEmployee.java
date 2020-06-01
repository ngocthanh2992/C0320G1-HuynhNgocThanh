package Controllers;

import Commons.FuncFileCSVEmployee;
import Models.Customer;
import Models.Employee;
import Models.TuHoSo;

import java.util.ArrayList;
import java.util.Scanner;


public class FindInformationOfEmployee {
    public static void findInformationOfEmployee() {
        Scanner scanner = new Scanner(System.in);
        TuHoSo tuHoSo = new TuHoSo();
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee  = FuncFileCSVEmployee.getFileCsvToListEmployee();
        System.out.println("Enter id:");
        String temp = scanner.nextLine();
        String idCustomer = String.valueOf(tuHoSo.stackHoSo().search(temp));
        if (idCustomer != null) {
            System.out.println(listEmployee.get(Integer.parseInt(temp)-1));
        } else {
            System.out.println("Not Found");
        }
    }
}
