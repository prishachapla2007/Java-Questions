public class PasswordChecker {
    private final String password;

    PasswordChecker(String p) {
        password = p;
    }

    String getStrength() {
        if (password.length() < 6)
            return "Weak";
        if (password.length() < 10)
            return "Medium";
        return "Strong";
    }

    public static void main(String[] args) {
        PasswordChecker p = new PasswordChecker("abcd");
        System.out.println(p.getStrength());

        PasswordChecker p2 = new PasswordChecker("abcdefghij");
        System.out.println(p2.getStrength());
    }
}