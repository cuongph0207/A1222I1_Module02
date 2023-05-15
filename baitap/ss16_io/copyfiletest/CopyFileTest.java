package module2.baitap.ss16_io.copyfiletest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileTest {
    public static final String FILE_PATH2 = "D:\\Codegym\\Module02\\A1222I1_Module02\\baitap\\ss16_io\\copyfiletest\\Target.csv";
    public static final String FILE_PATH3 = "D:\\Codegym\\Module02\\A1222I1_Module02\\baitap\\ss16_io\\copyfiletest\\Ssource.csv";

    public static List<Integer> readCSV() throws IOException {
        List<Integer> number = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH3);
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            String temp[];
            while ((line = br.readLine()) != null) {
                number.add(Integer.parseInt(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
        }
        return number;
    }

    public static void writeCSV(List<Integer> number) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH2, true);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        for (int i : number) {
            bw.write("" + i);
            bw.newLine();
        }
        bw.close();
    }

}
