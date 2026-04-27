import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Workable> workers = new ArrayList<>();
        workers.add(new Developer("Anna", 8, 1000));
        workers.add(new Tester(6));
        workers.add(new Manager("John", 5, 1200));

        Project project = new Project("New Platform", 50);

        while (!project.isFinished()) {
            for (Workable w : workers) {
                project.workOn(w);
            }
        }

        System.out.println("Project finished!");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Developer("Anna", 8, 1000));
        employees.add(new Manager("John", 5, 1200));

        for (Employee e : employees) {
            System.out.println(
                e.getName() + " salary: " + e.calculateSalary()
            );
        }
    }
}
