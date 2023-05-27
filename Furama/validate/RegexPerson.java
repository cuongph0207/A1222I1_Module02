package module2.Furama.validate;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class RegexPerson {
    static Scanner scanner = new Scanner(System.in);

    public static final String FOMAT_ID_CUSTOMER = "KH-[0-9]{4}";
    public static final String FOMAT_ID_EMPLOYEE = "NV-[0-9]{4}";
    public static final String FOMAT_NAME = "([A-Z][a-z ]*)+";
    private static final String REGEX_ID_CARD = "[0-9]{9,12}";
    private static final String REGEX_NUMBER_PHONE = "0+[0-9]{9}";
    private static final String REGEX_EMAIL = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";


    public static LocalDate age() {
        LocalDate birthday;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        while (true) {
            try {
                System.out.println("Nhập ngày sinh:");
                birthday = LocalDate.parse(scanner.nextLine(), dateFormat);
                LocalDate now = LocalDate.now();
                if (now.getYear() - birthday.getYear() < 18 || now.getYear() - birthday.getYear() > 100) {
                    throw new IOException("Tuổi Bạn phải trên 18 tuổi và dưới 100 tuổi");
                }
                return birthday;
            } catch (NumberFormatException | DateTimeParseException e) {
                System.out.println("Định dạng ngày sinh không chính xác (yyyy-MM-dd)");
            } catch (IOException e) {
                System.out.println("Tuổi Bạn phải trên 18 tuổi và dưới 100 tuổi");
            }

        }
    }

    public static String name() {
        System.out.println("Nhập Tên Của Bạn");
        return RegexData.regexStr(scanner.nextLine(), FOMAT_NAME, "Sai Định Dạng , Đề Nghị Nhập Lại : ");
    }


    public static String idCard() {
        System.out.println("Nhập Chứng Minh Nhân Dân : ");
        String newIDCard = scanner.nextLine();
        while (!newIDCard.matches(REGEX_ID_CARD)) {
            System.out.println("Sai Định Dạng , Đề Nghị Nhập Lại : ");
            newIDCard = scanner.nextLine();
        }
        return newIDCard;
    }

    public static String idCustomer() {
        System.out.println("Nhập ID Khách Hàng : ");
        String idCustomer = scanner.nextLine();
        while (!idCustomer.matches(FOMAT_ID_CUSTOMER)) {
            System.out.println("Sai Định Dạng , Đề Nghị Nhập Lại : ");
            idCustomer = scanner.nextLine();
        }
        return idCustomer;
    }

    public static String idEmployee() {
        System.out.println("Nhập ID Nhân Viên : ");
        String idEmployee = scanner.nextLine();
        while (!idEmployee.matches(FOMAT_ID_EMPLOYEE)) {
            System.out.println("Sai Định Dạng , Đề Nghị Nhập Lại : ");
            idEmployee = scanner.nextLine();
        }
        return idEmployee;
    }

    public static String email() {
        System.out.println("Nhập Email : ");
        String newEmail = scanner.nextLine();
        while (!newEmail.matches(REGEX_EMAIL)) {
            System.out.println("Sai Định Dạng , Đề Nghị Nhập Lại : ");
            newEmail = scanner.nextLine();
        }
        return newEmail;
    }

    public static String phone() {
        System.out.println("Nhập Số Điện Thoại : ");
        String newPhone = scanner.nextLine();
        while (!newPhone.matches(REGEX_NUMBER_PHONE)) {
            System.out.println("Sai Định Dạng , Đề Nghị Nhập Lại : ");
            newPhone = scanner.nextLine();
        }
        return newPhone;
    }


    public static double salary() {
        double salary = 0;
        while (salary <= 0) {
            System.out.println("Nhập Lương Của Bạn (>0)");
            salary = scanner.nextDouble();
        }
        return salary;
    }

}
