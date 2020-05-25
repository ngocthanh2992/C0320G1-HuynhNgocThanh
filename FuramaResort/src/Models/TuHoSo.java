package Models;

import Commons.FuncFileCSVEmployee;

import java.util.ArrayList;
import java.util.Stack;

public class TuHoSo {
    public Stack<Employee> stackHoSo(){
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee  = FuncFileCSVEmployee.getFileCsvToListEmployee();
        Stack<Employee> stack = new Stack<>();
        for (Employee employee: listEmployee){
            stack.push(employee);
        }
        return stack;
    }
}
