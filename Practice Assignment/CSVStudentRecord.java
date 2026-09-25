public class CSVStudentRecord {

    static void parse(String data) {
        String[] a = data.split(",");

        if (a.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.println("Name: " + a[0] +
                " | Roll No: " + a[1] +
                " | Dept: " + a[2]);
    }

    public static void main(String[] args) {
        parse("Ananya Verma,RA2211003010123,CSE");
        parse("Ananya Verma,CSE");
    }
}