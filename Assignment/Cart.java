public class Cart {
    private double[] prices;
    private int count;
    private final String id;

    Cart(String i, int size) {
        id = i;
        prices = new double[size];
    }

    void addItem(double price) {
        if (count < prices.length && price >= 0)
            prices[count++] = price;
    }

    double getTotal() {
        double total = 0;
        for (int i = 0; i < count; i++)
            total += prices[i];
        return total;
    }

    int getItemCount() {
        return count;
    }

    public static void main(String[] args) {
        Cart c = new Cart("CART-5", 20);

        c.addItem(250);
        c.addItem(99);
        c.addItem(151);

        System.out.println(c.getTotal());
        System.out.println(c.getItemCount());
    }
}