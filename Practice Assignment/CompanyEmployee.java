public class CompanyEmployee {
    String name;
    double salary;

    static String company = "Bright Horizon Technologies";
    static int count;

    CompanyEmployee(String n, double s) {
        name = n;
        salary = s;
        count++;
    }

    static void printCompanyInfo() {
        System.out.println(company);
        System.out.println(count);
    }

    public static void main(String[] args) {
        new CompanyEmployee("A", 50000);
        new CompanyEmployee("B", 60000);
        new CompanyEmployee("C", 70000);

        CompanyEmployee.printCompanyInfo();
    }
}