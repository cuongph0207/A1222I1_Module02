package module2.baitap.ss16_io.readfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static final String PATH_FILE = "D:\\Codegym\\Module02\\A1222I1_Module02\\baitap\\ss16_io\\readfile\\National.csv";

    public static List<National>readCSV() throws IOException {
        List<National>na=new ArrayList<>();
        FileReader f1=new FileReader(PATH_FILE);
        BufferedReader br=new BufferedReader(f1);
        String line;
        National national;
        String temp[];
        while((line=br.readLine())!=null)
        {
            temp=line.split(",");
            int id=Integer.parseInt(temp[0]);
            String code=temp[1];
            String name=temp[2];
            national=new National(id,code,name);
            na.add(national);
        }
        br.close();
        return na;
    }
}