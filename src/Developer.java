public class Developer extends Employee {

    public Developer(String name, int skill, double baseRate) {
        super(name, skill, baseRate);
    }

    @Override
    public int work() {
        return skill * 2;
    }
}