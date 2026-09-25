public class FirstNonRepeatingCharacter {

    static char find(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (s.indexOf(c) == s.lastIndexOf(c))
                return c;
        }

        return '-';
    }

    public static void main(String[] args) {
        System.out.println(find("swiss"));
    }
}