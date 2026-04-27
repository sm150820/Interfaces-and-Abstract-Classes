public class Tester implements Workable {

    private int skill;

    public Tester(int skill) {
        this.skill = skill;
    }

    @Override
    public int work() {
        return skill;
    }
}