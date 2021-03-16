package Account;

public class AccountTest {
    private static Account account;

    // xay dung mau account hop le;
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdef"};

    // xay dung mau account ko hop le;
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234", "abcde"};

    public static void main(String[] args) {
        account = new Account();
        for (String act :
                validAccount) {
            boolean isValid = account.validate(act);
            System.out.println("Account is " + act + " is valid: " + isValid);

        }
        for (String act :
                invalidAccount) {
            boolean isValid = account.validate(act);
            System.out.println("Account is " + act + " is valid : " + isValid);
        }
    }
}
