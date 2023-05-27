package module2.Furama.until;

import module2.Furama.model.Facility;
import module2.Furama.model.House;

import java.io.*;
import java.util.LinkedHashMap;

public class ReadAndWriteHouse {
    private static final String FILE_PATH = "D:\\Codegym\\Module02\\A1222I1_Module02\\Furama\\data\\House.csv";

    public static LinkedHashMap<Facility, Integer> readCSV() throws IOException {
        LinkedHashMap<Facility, Integer> fac = new LinkedHashMap<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        String line;
        String[] temp;
        House house;

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            String id = temp[0];
            String name = temp[1];
            double price = Double.parseDouble(temp[2]);
            int numberOfPeople = Integer.parseInt(temp[3]);
            String rentalTyle = temp[4];
            double usableArea = Double.parseDouble(temp[5]);
            String roomStandard = temp[6];
            int numberOfFloors = Integer.parseInt(temp[7]);
            house = new House(id, name,usableArea, price, numberOfPeople, rentalTyle, roomStandard, numberOfFloors);
            fac.put(house, 0);
        }
        buff.close();
        return fac;
    }

    public static void writeCSV(LinkedHashMap<Facility, Integer> houseLinkdedHashMap) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Facility facility : houseLinkdedHashMap.keySet()) {
            if (facility instanceof House) {
                House house = new House();
                bufferedWriter.write(house.getServiceCode() + "," + house.getServiceName() + ","+ house.getArea() +","+ house.getPrice() + "," + house.getNumberOfPeople() + "," + house.getStyleRent() + "," + house.getFloor() + "\n");

            }
        }
        bufferedWriter.close();

    }
}