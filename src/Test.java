public class Test {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gamil.com", "ab@yahoo.com", "abc@hotmail.coom"};
    public static final String[] invalidEmail = new String[]{"@gamil.", "@yahoo.com", "abc@hotmail.coom"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email :
                validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + "is valid: " + isvalid);
        }
        for (String email :
                invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + "is valid :" + isvalid);
        }
    }

}
