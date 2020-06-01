package Commons;

import Models.Customer;

import java.io.FileWriter;
import java.util.ArrayList;

public class FuncFileCSVBooking {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameBooking = "src/Data/Booking.csv";

    private static final String FILE_HEADER_BOOKING = "Name,Birthday,Gender,Phone,Identity Card,Email,Type Customer,Address,serviceCode,id,nameService,areaOfUse,rentalCost,maximumPeople,typeOfRent";

    public static void writeBookingToFileCSV(Customer customer) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameBooking, true);
            fileWriter.append(FILE_HEADER_BOOKING);
            fileWriter.append(NEW_LINE_SEPARATOR);
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
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getServices().getServiceCode());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getServices().getId());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getServices().getNameService());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(customer.getServices().getAreaOfUse()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(customer.getServices().getRentalCost()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(customer.getServices().getMaximumPeople()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getServices().getTypeOfRent());
            fileWriter.append(NEW_LINE_SEPARATOR);
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
}
