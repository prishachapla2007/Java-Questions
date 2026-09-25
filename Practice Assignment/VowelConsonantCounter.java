public class VowelConsonantCounter {

    static void count(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));

            if ("aeiou".indexOf(c) >= 0)
                vowels++;
            else if (c != ' ')
                consonants++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        count("Java Programming");
    }
}