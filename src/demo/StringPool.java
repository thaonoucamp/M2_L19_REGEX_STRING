package demo;

public class StringPool {
    public static void main(String[] args) {
        String a = "C02H";
        String a1 = "C02H";
        String a2 = new String("C02H");
        System.out.println(a.hashCode());
//        System.out.println(a2.hashCode());
//        System.out.println(a2 == a1);
        a = a + "1";
        System.out.println(a.hashCode());
    }
}
