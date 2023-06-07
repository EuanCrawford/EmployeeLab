package Main;

public abstract class Employee {

    private String name;
    private int NINumber;
    private double salary;

    public Employee(String name, int NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(Double salaryIncrease) {
        if (salaryIncrease > 0) {
            this.salary += salaryIncrease;
            return this.salary;
        }
        return this.salary;
    }

    public double payBonus() {
        return this.salary / 100;
    }

    public void setName(String name) {
        if (name != null){
            this.name = name;
        }

    }
}
