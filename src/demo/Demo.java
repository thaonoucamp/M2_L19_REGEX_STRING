package demo;

import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
        String mes = "Welcome\tto\tJava";
        String mes1 = "\tand\tHTML";
        String m = mes.concat(mes1);
        String my = mes + "\tand HTML";
        System.out.println(my.contains(mes));
//        System.out.println("\twelcome to java\t".trim());
//        System.out.println(my.toUpperCase());
//        System.out.println(m);
//        System.out.println("the length :" + mes.charAt(7));
    }
}
