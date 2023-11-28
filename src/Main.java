import com.workintech.TaskData;
import entity.Priority;
import entity.Status;
import entity.Task;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("s15d2", "dummy dec", "bob", Priority.HIGH, Status.ASSIGNED);
        Task task2 = new Task("s15d2", "dummy dec2", "bob", Priority.HIGH, Status.IN_QUEUE);

        Task task3 = new Task("s15d2", "dummy dec2", "ann", Priority.MED, Status.ASSIGNED);

        Task task4 = new Task("s15d2", "dummy dec2", "carol", Priority.LOW, Status.IN_QUEUE);


        Set<Task> annTasks = new LinkedHashSet<>();
        annTasks.add(task3);

        Set<Task> bobTask = new LinkedHashSet<>();
        bobTask.add(task1);

        Set<Task> carolTask = new LinkedHashSet<>();
        carolTask.add(task4);

        TaskData taskData = new TaskData(annTasks, bobTask, carolTask, null);

        System.out.println("---1---");
        Set<Task> all = taskData.getTasks("all");
        System.out.println(all);
        System.out.println("***2***");
        taskData.getTasks("bob");
        taskData.getTasks("ann");
        taskData.getTasks("carol");

        System.out.println("---3----");
        taskData.getIntersection(bobTask, annTasks);
        taskData.getIntersection(bobTask, carolTask);
        taskData.getIntersection(carolTask, annTasks);
    }
}