package demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    // regex nhap ngay-thang-nam
    public static void main(String[] args) {
        String str = "welcome to gp coder";
        String regex = ".*\\Z$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        boolean check = matcher.matches();
        System.out.println(check);
    }
}
