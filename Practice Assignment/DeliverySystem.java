import java.util.*;

public class DeliverySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            double w = sc.nextDouble();
            double d = sc.nextDouble();
            double fee;

            if (type.equals("STANDARD"))
                fee = 5 + 0.5 * w + 0.1 * d;

            else if (type.equals("EXPRESS"))
                fee = 15 + w + 0.2 * d;

            else {
                double c = sc.nextDouble();
                fee = 25 + 2 * w + 0.5 * d + c;
            }

            System.out.printf("%s: %.2f%n", type, fee);
            total += fee;
        }

        System.out.printf("Total: %.2f", total);
        sc.close();
    }
}