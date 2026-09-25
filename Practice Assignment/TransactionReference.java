public class TransactionReference {

    static String normalize(String raw) {
        raw = raw.trim();
        return raw.substring(0, 3).toUpperCase() + raw.substring(3);
    }

    static String validate(String ref) {
        if (ref.length() != 14)
            return "Invalid: wrong length";

        for (int i = 0; i < 3; i++)
            if (!Character.isLetter(ref.charAt(i)))
                return "Invalid: bank code must be 3 letters";

        for (int i = 3; i < 14; i++)
            if (!Character.isDigit(ref.charAt(i)))
                return "Invalid: body must contain digits";

        StringBuilder s = new StringBuilder();
        s.append("[").append(ref.substring(0, 3)).append("] ");
        s.append("DATE: ").append(ref.substring(3, 5)).append("/");
        s.append(ref.substring(5, 7)).append("/");
        s.append(ref.substring(7, 9)).append(" | SEQ: ");
        s.append(ref.substring(9));

        return s.toString();
    }

    public static void main(String[] args) {
        String ref = normalize(" hdf03022600042 ");
        System.out.println(validate(ref));

        System.out.println(validate(normalize("12F03022600042")));
    }
}