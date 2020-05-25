package Commons;

import Models.Employee;
import Models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FuncFileCSVEmployee {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameEmployee = "src/Data/Employee.csv";

    private static final String FILE_HEADER_EMPLOYEE = "id,name,age,address";

    public static void writeEmployeeToFileCSV(ArrayList<Employee> listEmployee) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameEmployee, true);
            fileWriter.append(FILE_HEADER_EMPLOYEE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Employee employee : listEmployee) {
                fileWriter.append(employee.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getAge());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Error in CSV file writer");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }
    public static ArrayList<Employee> getFileCsvToListEmployee() {
        BufferedReader br = null;
        ArrayList<Employee> listEmployee = new ArrayList<Employee>();

        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameEmployee));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Employee employee = new Employee();
                employee.setId(splitData[0]);
                employee.setName(splitData[1]);
                employee.setAge(splitData[2]);
                employee.setAddress(splitData[3]);
                listEmployee.add(employee);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listEmployee;
    }
}
