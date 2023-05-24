package module2.baitap.ss19_string_and_regex.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhoneNumber {
    private static final String PHONE_REGEX = " ^(84-0)\\d{9}$ ";

    public RegexPhoneNumber() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
