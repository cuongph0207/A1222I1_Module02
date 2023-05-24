package module2.baitap.ss19_string_and_regex.validate_ten_lop_hoc;

public class ClassNameTest {
    public static final String[] className = new String[]{" C0318G", "M0318G", "P0323A"};

    public static void main(String[] args) {
        RegexClassName regexClassName = new RegexClassName();
        for (String string : className) {
            System.out.println(" Class name " + string + " is " + regexClassName.validate(string));
        }
    }
}