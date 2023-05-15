package module2.baitap.ss16_io.readfile;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<National>na=ReadFile.readCSV();
        for(National national:na)
        {
            System.out.println(national);
        }
    }
}
