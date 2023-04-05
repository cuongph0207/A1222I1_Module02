package module2.baitap.ss4_lop_va_doi_tuong_trong_java.stop_watch;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Watch watch = new Watch();
        watch.start();
        System.out.println("Do you want stop the clock?If you want,please enter 'ok'");
        String input = scanner.nextLine();
        if (Objects.equals(input, "ok")){
            watch.stop();
        }
        System.out.println(watch.getElapsedTime());
    }
}
