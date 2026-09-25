public class AttendanceSheet {
    private String[] names;
    private int count;

    AttendanceSheet(int n) {
        names = new String[n];
    }

    void markPresent(String name) {
        if (!isPresent(name))
            names[count++] = name;
    }

    int getCount() {
        return count;
    }

    boolean isPresent(String name) {
        for (int i = 0; i < count; i++)
            if (names[i].equals(name))
                return true;
        return false;
    }

    public static void main(String[] args) {
        AttendanceSheet a = new AttendanceSheet(10);

        a.markPresent("Ana");
        a.markPresent("Ben");
        a.markPresent("Ana");

        System.out.println(a.getCount());
        System.out.println(a.isPresent("Ben"));
        System.out.println(a.isPresent("Chen"));
    }
}