package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) throws IllegalArgumentException {
        if (raise < 0) {
            throw new IllegalArgumentException("Please enter a number greater than zero");
        } else {
            this.salary += raise;
        }
    }

    public double payBonus() {
        return this.salary / 100;
    }
}
