public class Employeefull extends Employee {
    private int day;
    public Employeefull(String name, int salary, int day) {
        super(name, salary);
        this.day = day;
    }

    @Override
    public int getSalary() {
        return 150000* day;
    }

    @Override
    public String toString() {
        return "Employeefull{" +
                "day=" + day +
                "salary="+ getSalary()+
                '}';
    }
}
