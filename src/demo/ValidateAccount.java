package demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    Scanner sc = new Scanner(System.in);
    Pattern pattern;
    Matcher matcher;
    final String REGEX = "^[0-9]{2}[-|/][0-9]{2}[-|/][0-9]{4}$";

    public ValidateAccount() {
        pattern=Pattern.compile(REGEX);
    }

    public boolean validate(){
            System.out.println("Enter string :");
            String s = sc.nextLine();
            matcher = pattern.matcher(s);
            return matcher.matches();
    }

    public static void main(String[] args) {
        ValidateAccount validate = new ValidateAccount();
        do {
            boolean check = validate.validate();
            System.out.println(check);
        }while (true);
    }
}
