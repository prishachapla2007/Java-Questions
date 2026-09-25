public class Employee {
    String id, name;
    double salary;
    boolean intern;

    Employee(String i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    Employee(String i, String n) {
        this(i, n, 0);
        intern = true;
    }

    void printProfile() {
        System.out.println(id + " " + name + " " + salary + " " + intern);
    }

    public static void main(String[] args) {
        new Employee("E1", "Priya", 50000).printProfile();
        new Employee("E2", "Rahul").printProfile();
    }
}