public class PiggyBank {
    private double money;
    private final String id;

    PiggyBank(String i) {
        id = i;
        money = 0;
    }

    void deposit(double x) {
        if (x > 0) money += x;
    }

    void withdraw(double x) {
        if (x <= money) money -= x;
    }

    double getMoney() {
        return money;
    }

    public static void main(String[] args) {
        PiggyBank p = new PiggyBank("P1");
        p.deposit(100);
        p.withdraw(30);
        System.out.println(p.getMoney());
    }
}