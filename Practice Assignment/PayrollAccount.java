public class PayrollAccount{
    private double salary, bonus;

    PayrollAccount(double s) {
        salary = s >= 0 ? s : 0;
    }

    void creditBonus(double b) {
        if (b > 0) bonus += b;
    }

    void deductTax(double t) {
        if (t >= 0 && t <= 100)
            salary -= salary * t / 100;
    }

    double getNetSalary() {
        return salary + bonus;
    }

    public static void main(String[] args) {
        PayrollAccount p = new PayrollAccount(50000);
        p.creditBonus(5000);
        p.deductTax(10);
        System.out.println(p.getNetSalary());
    }
}