public class Project {

    private String name;
    private int requiredWork;
    private int progress;

    public Project(String name, int requiredWork) {
        this.name = name;
        this.requiredWork = requiredWork;
        this.progress = 0;
    }

    public void workOn(Workable worker) {
        if (!isFinished()) {
            progress += worker.work();
            if (progress > requiredWork) {
                progress = requiredWork;
            }
        }
    }

    public boolean isFinished() {
        return progress >= requiredWork;
    }

    public int getProgress() {
        return progress;
    }
}