public class MaskedPhoneNumber {

    static String mask(String phone) {
        if (phone.length() != 10)
            return "Invalid phone number";

        for (char c : phone.toCharArray())
            if (!Character.isDigit(c))
                return "Invalid phone number";

        StringBuilder s = new StringBuilder("XXXXXX");
        s.insert(6, "-" + phone.substring(6));

        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(mask("9876543210"));
        System.out.println(mask("98765"));
    }
}