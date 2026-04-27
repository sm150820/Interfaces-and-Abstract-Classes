public abstract class Employee implements Workable, Payable {

    protected String name;
    protected int skill;
    protected double baseRate;

    public Employee(String name, int skill, double baseRate) {
        this.name = name;
        this.skill = skill;
        this.baseRate = baseRate;
    }

    @Override
    public abstract int work();

    @Override
    public double calculateSalary() {
        return skill * baseRate;
    }

    public String getName() {
        return name;
    }
}
