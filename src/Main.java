import entity.TaskData;
import entity.Priority;
import entity.Status;
import entity.Task;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("s15d2", "dummy dec", "bob", Priority.HIGH, Status.ASSIGNED);

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
        Set<Task> bobTasks = taskData.getTasks("bob");
        System.out.println(bobTasks);
        Set<Task> annTaskss = taskData.getTasks("ann");
        System.out.println(annTaskss);
        Set<Task> carolTasks = taskData.getTasks("carol");
        System.out.println(carolTasks);
        System.out.println("***2end***");

        System.out.println("---3----");
        Set<Task> intersection1 = taskData.getIntersection(taskData.getTasks("bob"), taskData.getTasks("ann"));
        System.out.println(intersection1);
        Set<Task> intersection2 = taskData.getIntersection(taskData.getTasks("bob"), taskData.getTasks("carol"));
        System.out.println(intersection2);
        Set<Task> intersection3 = taskData.getIntersection(taskData.getTasks("carol"), taskData.getTasks("ann"));
        System.out.println(intersection3);
        System.out.println("---3end----");

    }
}