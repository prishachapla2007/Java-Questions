public class HallTicket {
    String name;
    int seat;

    HallTicket(String n, int s) {
        name = n;
        seat = s;
    }

    public static void main(String[] args) {
        HallTicket a = new HallTicket("Priya", 10);
        HallTicket b = a;
        b.seat = 45;

        HallTicket c = new HallTicket("Priya", 45);

        System.out.println(a.seat);
        System.out.println(a == b);
        System.out.println(a == c);
    }
}