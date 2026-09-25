public class BookInventory {
    String title, author;
    int copies;

    BookInventory(String t, String a, int c) {
        title = t;
        author = a;
        copies = c;
    }

    void printEntry() {
        System.out.println(title + " by " + author + " - " + copies + " copies");
    }

    public static void main(String[] args) {
        BookInventory[] books = {
            new BookInventory("Java", "James", 3),
            new BookInventory("Python", "Guido", 5),
            new BookInventory("C++", "Bjarne", 2),
            new BookInventory("SQL", "John", 4)
        };

        for (BookInventory b : books)
            b.printEntry();
    }
}