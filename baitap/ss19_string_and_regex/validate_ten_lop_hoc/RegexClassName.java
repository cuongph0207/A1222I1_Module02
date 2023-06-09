package module2.baitap.ss19_string_and_regex.validate_ten_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClassName {
    private static final String CLASS_REGEX = " ^[A|C|P]\\d{4}[G|H|I|K|L|M]$ ";

    public RegexClassName() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
