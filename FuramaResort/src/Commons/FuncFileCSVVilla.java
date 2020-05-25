package Commons;

import Models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSVVilla {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameVilla = "src/Data/Villa.csv";

    private static final String FILE_HEADER_VILLA = "serviceCode,id,nameService,areaOfUse,rentalCost,maximumPeople,typeOfRent,roomStandard,otherFacilities,poolArea,numberOfFloor";

    public static void writeVillaToFileCSV(ArrayList<Villa> listVilla) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameVilla, true);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa : listVilla) {
                fileWriter.append(villa.getServiceCode());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getAreaOfUse()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.valueOf(villa.getRentalCost()).toString());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.valueOf(villa.getMaximumPeople()).toString());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getTypeOfRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getOtherFacilities());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.valueOf(villa.getPoolArea()).toString());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.valueOf(villa.getNumberOfFloor()).toString());
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

    public static ArrayList<Villa> getFileCsvToListVilla() {
        BufferedReader br = null;
        ArrayList<Villa> listVilla = new ArrayList<Villa>();

        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameVilla));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("serviceCode")) {
                    continue;
                }
                Villa villa = new Villa();
                villa.setServiceCode(splitData[0]);
                villa.setId(splitData[1]);
                villa.setNameService(splitData[2]);
                villa.setAreaOfUse(Integer.parseInt(splitData[3]));
                villa.setRentalCost(Integer.parseInt(splitData[4]));
                villa.setMaximumPeople(Integer.parseInt(splitData[5]));
                villa.setTypeOfRent(splitData[6]);
                villa.setRoomStandard(splitData[7]);
                villa.setOtherFacilities(splitData[8]);
                villa.setPoolArea(Integer.parseInt(splitData[9]));
                villa.setNumberOfFloor(Integer.parseInt(splitData[10]));
                listVilla.add(villa);
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
        return listVilla;
    }
}
