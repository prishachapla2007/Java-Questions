public class DuplicatePlayerPickChecker {
    static String findDuplicatePick(String[] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[i].equals(a[j]))
                    return "Duplicate Found: " + a[i];
        return "No Duplicates Found";
    }

    public static void main(String[] args) {
        System.out.println(findDuplicatePick(
            new String[]{"Kohli", "Bumrah", "Kohli", "Rohit"}));
    }
}