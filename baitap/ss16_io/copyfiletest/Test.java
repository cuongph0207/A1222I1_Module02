package module2.baitap.ss16_io.copyfiletest;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Integer>number=CopyFileTest.readCSV();
        for(int i:number)
        {
            System.out.println(i);
        }
        CopyFileTest.writeCSV(number);
    }
}
