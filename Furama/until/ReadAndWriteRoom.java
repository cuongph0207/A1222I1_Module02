package module2.Furama.until;

import module2.Furama.model.Facility;
import module2.Furama.model.Room;

import java.io.*;
import java.util.LinkedHashMap;

public class ReadAndWriteRoom {
    private static final String FILE_PATH = "D:\\Codegym\\Module02\\A1222I1_Module02\\Furama\\data\\Room.csv";

    public static LinkedHashMap<Facility, Integer> readCSV() throws IOException {
        LinkedHashMap<Facility, Integer> fac = new LinkedHashMap<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        String line;
        String[] temp;
        Room room;

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            String id = temp[0];
            String name = temp[1];
            double price = Double.parseDouble(temp[2]);
            int numberOfPeople = Integer.parseInt(temp[3]);
            String rentalTyle = temp[4];
            double usableArea = Double.parseDouble(temp[5]);
            String freeService = temp[6];
            room = new Room(id, name, usableArea, price, numberOfPeople, rentalTyle, freeService);
            fac.put(room, 0);
        }
        buff.close();
        return fac;
    }

    public static void writeCSV(LinkedHashMap<Facility, Integer> roomLinkedHashMap) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Facility facility : roomLinkedHashMap.keySet()) {
            if (facility instanceof Room) {
                Room room = (Room) facility;
                bufferedWriter.write(room.getServiceCode() + "," + room.getServiceName() + "," + room.getPrice() + "," + room.getNumberOfPeople() + "," + room.getStyleRent() + "," + room.getArea() + "," + room.getFreeService() + "\n");
            }
        }
        bufferedWriter.close();

    }
}
