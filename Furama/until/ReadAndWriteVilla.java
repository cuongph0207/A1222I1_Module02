package module2.Furama.until;

import module2.Furama.model.Facility;
import module2.Furama.model.Villa;

import java.io.*;
import java.util.LinkedHashMap;

public class ReadAndWriteVilla {
    private static final String FILE_PATH = "D:\\Codegym\\Module02\\A1222I1_Module02\\Furama\\data\\Villa.csv";

    public static LinkedHashMap<Facility, Integer> readCSV() throws IOException {
        LinkedHashMap<Facility, Integer> fac = new LinkedHashMap<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        String line;
        String[] temp;
        Villa villa;

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
            double poolArea = Double.parseDouble(temp[8]);
            villa = new Villa(id, name,usableArea, price, numberOfPeople, rentalTyle, roomStandard,poolArea, numberOfFloors);
            fac.put(villa, 0);
        }
        buff.close();
        return fac;
    }

    public static void writeCSV(LinkedHashMap<Facility, Integer> villaIntegerLinkedHashMap) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Facility facility : villaIntegerLinkedHashMap.keySet()) {
            if (facility instanceof Villa) {
                Villa villa = (Villa) facility;
                bufferedWriter.write(villa.getServiceCode() + "," + villa.getServiceName() + "," + villa.getPrice() + "," + villa.getNumberOfPeople() + "," + villa.getStyleRent() + "," + villa.getArea() + "," + villa.getRoomStandard() + ","+ villa.getPoolArea() + villa.getFloor() +"," +"\n");
            }
        }
        bufferedWriter.close();
    }
}