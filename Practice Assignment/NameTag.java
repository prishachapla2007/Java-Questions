public class NameTag {
    private final String first, last;

    NameTag(String name) {
        String[] a = name.split(" ");
        first = a[0];
        last = a[1];
    }

    String getNickname() {
        return first + " " + last.charAt(0) + ".";
    }

    public static void main(String[] args) {
        NameTag n = new NameTag("Maria Gomez");
        System.out.println(n.getNickname());
    }
}