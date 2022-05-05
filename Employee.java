public class Employee {
    private String name;
    private int salary;
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public int getSalary() {
        System.out.println("Unknown time! Can not calculate salary");
        return 0;
    }
}
