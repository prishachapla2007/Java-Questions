import java.util.*;
import java.time.*;

public class LibraryItems {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        LocalDate date = LocalDate.of(2023, 10, 26);

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            String title = sc.nextLine().trim().replace("\"", "");

            int days;

            if (type.equals("BOOK"))
                days = 14;
            else if (type.equals("DVD"))
                days = 7;
            else
                days = 3;

            LocalDate dueDate = date.plusDays(days);

            System.out.println(title + ": " + dueDate);
        }

        sc.close();
    }
}