package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoValidate {
    private Pattern pattern;
    private Matcher matcher;
    private final String REGEX = "^.+@.+\\..+$";

    public DemoValidate() {
        pattern = Pattern.compile(REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] valiEmail = new String[]{"a@gmail.com", "ab@yahoo.com",};
        String[] valiEmail1 = new String[]{"@gmail.com", "a@yahoo.", "a@.com"};
        DemoValidate validate = new DemoValidate();

        for (String email :
                valiEmail) {
            boolean check = validate.validate(email);
            System.out.println(check);
        }

        System.out.println("---");

        for (String email :
                valiEmail1) {
            boolean check = validate.validate(email);
            System.out.println(check);
        }
    }
}
