package Account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    // Pattern "^[_a-z0-9]{6,}$";

    // tao bien static chua dinh dang;
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public Account() {
    }

    // Phuong thuc validate de check tai khoan;
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
// 1 - ko chua cac ky tu dac biet;
// 2 - it nhat la 6 ky tu;
// 3 - ko chua cac ky tu viet hoa;
// 4 - cho phep dau gach duoi;
