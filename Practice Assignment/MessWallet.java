public class MessWallet {
    private double balance;

    public MessWallet(double b) {
        if (b < 0) {
            System.out.println("Invalid opening balance");
            b = 0;
        }
        balance = b;
    }

    public void topUp(double a) {
        if (a <= 0)
            System.out.println("Invalid top-up");
        else {
            balance += a;
            System.out.println("Balance after top-up: " + balance);
        }
    }

    public void deduct(double a) {
        if (a > balance)
            System.out.println("Deduct rejected: insufficient balance");
        else
            balance -= a;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        MessWallet w = new MessWallet(500);
        w.topUp(200);
        w.deduct(1000);
        System.out.println("Final balance: " + w.getBalance());
    }
}