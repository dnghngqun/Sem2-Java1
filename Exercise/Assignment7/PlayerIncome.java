public class PlayerIncome extends Player implements Tax {
    @Override
    public double calculateTax(double salary) {
        return salary * TAX_PERCENT;
    }

    private double salary;
    public PlayerIncome(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void displayDetail() {
        System.out.println("Name: " + super.getName());
        System.out.println("Salary: " + salary);
    }

    public double getSalary() {
        return salary;
    }
}
