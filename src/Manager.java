public class Manager extends Employee {

    public Manager(String name, int skill, double baseRate) {
        super(name, skill, baseRate);
    }

    @Override
    public int work() {
        return skill;
    }
}