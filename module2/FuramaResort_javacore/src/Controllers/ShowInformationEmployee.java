package Controllers;

import Commons.FuncFileCSVEmployee;
import Models.Employee;

import java.util.*;

import static Controllers.MainController.displayMainMenu;

public class ShowInformationEmployee {
    public static void showInformationOfEmployee() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        listEmployee = FuncFileCSVEmployee.getFileCsvToListEmployee();
        Map<Integer, Employee> map = new HashMap<>();
        int i = 0;
        for (Employee employee: listEmployee) {
            i++;
            map.put(i, employee);
        }
        Set<Integer> set = map.keySet();
        for (Integer key: set){
            System.out.println(key + " "+ map.get(key));
        }
        System.out.println("Enter to continue");
        scanner.nextLine();
        displayMainMenu();
    }
}
