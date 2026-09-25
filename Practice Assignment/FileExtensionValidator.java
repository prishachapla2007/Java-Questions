public class FileExtensionValidator {

    static String validate(String file) {
        int dot = file.lastIndexOf('.');

        if (dot == -1)
            return "Rejected - invalid file type";

        String ext = file.substring(dot + 1);

        if (ext.equalsIgnoreCase("pdf") ||
            ext.equalsIgnoreCase("docx") ||
            ext.equalsIgnoreCase("zip"))
            return "Accepted";

        return "Rejected - invalid file type";
    }

    public static void main(String[] args) {
        System.out.println(validate("Assignment1.PDF"));
        System.out.println(validate("notes.txt"));
    }
}