package Commons;

import Models.Customer;
import Models.House;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class FuncFileCSVCustomer {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameCustomer = "src/Data/Customer.csv";

    private static final String FILE_HEADER_CUSTOMER = "Name,Birthday,Gender,Phone,Identity Card,Email,Type Customer,Address";

    public static void writeCustomerToFileCSV(ArrayList<Customer> listCustomer) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameCustomer, true);
            fileWriter.append(FILE_HEADER_CUSTOMER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customer customer : listCustomer) {
                fileWriter.append(customer.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getBirthday());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.isGender());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getPhone()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getIdentityCard()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getTypeCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

        } catch (Exception e) {
            System.out.println("Error in CSV file writer");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                System.out.println("Error when flush or close");
            }
        }
    }
    public static ArrayList<Customer> getFileCsvToListCustomer(){
        BufferedReader br = null;
        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
        try {
         String line;
         br = new BufferedReader(new FileReader(fileNameCustomer));
         while ((line = br.readLine())!= null){
             String[] spitData = line.split(",");
             if (spitData[0].equals("Name")){
                 continue;
             }
             Customer customer = new Customer();
             customer.setName(spitData[0]);
             customer.setBirthday(spitData[1]);
             customer.setGender(spitData[2]);
             customer.setPhone(Long.parseLong(spitData[3]));
             customer.setIdentityCard(Long.parseLong(spitData[4]));
             customer.setEmail(spitData[5]);
             customer.setTypeCustomer(spitData[6]);
             customer.setAddress(spitData[7]);
             listCustomer.add(customer);
         }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listCustomer;
    }
}
