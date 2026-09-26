public class TransportSystem {

    static class Transport {
        double distance;

        Transport(double d) {
            distance = d;
        }

        double fare() {
            return 0;
        }
    }

    static class Bus extends Transport {
        Bus(double d) {
            super(d);
        }

        double fare() {
            return Math.min(2 + distance * .1, 10);
        }
    }

    static class Train extends Transport {
        Train(double d) {
            super(d);
        }

        double fare() {
            return 3 + distance * .15;
        }
    }

    static class Metro extends Transport {
        double factor;

        Metro(double d, double f) {
            super(d);
            factor = f;
        }

        double fare() {
            return (1.5 + distance * .2) * factor;
        }
    }

    public static void main(String[] args) {
        Transport[] t = {
            new Bus(15),
            new Train(50),
            new Metro(10, 1.5)
        };

        double total = 0;

        for (Transport x : t) {
            System.out.println(x.fare());
            total += x.fare();
        }

        System.out.println("Total: " + total);
    }
}