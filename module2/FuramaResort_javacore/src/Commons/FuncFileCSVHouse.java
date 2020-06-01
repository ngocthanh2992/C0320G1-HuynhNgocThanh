package Commons;

import Models.House;
import Models.Villa;

import javax.swing.plaf.PanelUI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FuncFileCSVHouse {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameHouse = "src/Data/House.csv";

    private static final String FILE_HEADER_HOUSE = "serviceCode,id,nameService,areaOfUse,rentalCost,maximumPeople,typeOfRent,roomStandard,otherFacilities,poolArea,numberOfFloor";

    public static void writeHouseToFileCSV(ArrayList<House> listHouse) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameHouse, true);
            fileWriter.append(FILE_HEADER_HOUSE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (House house: listHouse){
                fileWriter.append(house.getServiceCode());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getAreaOfUse()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.valueOf(house.getRentalCost()).toString());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.valueOf(house.getMaximumPeople()).toString());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getTypeOfRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getOtherFacilities());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.valueOf(house.getPoolArea()).toString());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.valueOf(house.getNumberOfFloor()).toString());
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
    public static ArrayList<House> getFileCsvToListHouse(){
        BufferedReader br = null;
        ArrayList<House> listHouse = new ArrayList<House>();

        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameHouse));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("serviceCode")) {
                    continue;
                }
                House house = new House();
                house.setServiceCode(splitData[0]);
                house.setId(splitData[1]);
                house.setNameService(splitData[2]);
                house.setAreaOfUse(Integer.parseInt(splitData[3]));
                house.setRentalCost(Integer.parseInt(splitData[4]));
                house.setMaximumPeople(Integer.parseInt(splitData[5]));
                house.setTypeOfRent(splitData[6]);
                house.setRoomStandard(splitData[7]);
                house.setOtherFacilities(splitData[8]);
                house.setPoolArea(Integer.parseInt(splitData[9]));
                house.setNumberOfFloor(Integer.parseInt(splitData[10]));
                listHouse.add(house);
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
        return listHouse;
    }
}
