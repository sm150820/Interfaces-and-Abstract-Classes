public class BugFixTask extends Task {

    public BugFixTask(String description) {
        super(description);
    }

    @Override
    public int getRequiredWork() {
        return 5;
    }
}