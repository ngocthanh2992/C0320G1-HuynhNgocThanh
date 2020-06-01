package Commons;

import Models.House;
import Models.Room;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FuncFileCSVRoom {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameRoom = "src/Data/Room.csv";

    private static final String FILE_HEADER_HOUSE = "serviceCode,id,nameService,areaOfUse,rentalCost,maximumPeople,typeOfRent,freeService";

    public static void writeRoomToFileCSV(ArrayList<Room> listRoom) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameRoom, true);
            fileWriter.append(FILE_HEADER_HOUSE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Room room: listRoom){
                fileWriter.append(room.getServiceCode());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getAreaOfUse()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.valueOf(room.getRentalCost()).toString());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.valueOf(room.getMaximumPeople()).toString());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getTypeOfRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getFreeService());
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
    public static ArrayList<Room> getFileCsvToListRoom(){
        BufferedReader br = null;
        ArrayList<Room> listRoom = new ArrayList<Room>();

        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameRoom));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("serviceCode")) {
                    continue;
                }
                Room room = new Room();
                room.setServiceCode(splitData[0]);
                room.setId(splitData[1]);
                room.setNameService(splitData[2]);
                room.setAreaOfUse(Integer.parseInt(splitData[3]));
                room.setRentalCost(Integer.parseInt(splitData[4]));
                room.setMaximumPeople(Integer.parseInt(splitData[5]));
                room.setTypeOfRent(splitData[6]);
                room.setFreeSerivce(splitData[7]);
                listRoom.add(room);
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
        return listRoom;
    }
}
