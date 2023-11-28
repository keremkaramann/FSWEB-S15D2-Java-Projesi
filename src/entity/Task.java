package entity;

public class Task {
    private String project;
    private String description;
    private String assigment;
    private Priority priority;
    private Status status;

    public Task(String project, String description, String assigment, Priority priority, Status status) {
        this.project = project;
        this.description = description;
        this.assigment = assigment;
        this.priority = priority;
        this.status = status;
    }

    public String getProject() {
        return project;
    }

    public String getDescription() {
        return description;
    }

    public String getAssigment() {
        return assigment;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAssigment(String assigment) {
        this.assigment = assigment;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "project='" + project + '\'' +
                ", description='" + description + '\'' +
                ", assigment='" + assigment + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }
}
