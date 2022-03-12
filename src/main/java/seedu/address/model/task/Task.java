package seedu.address.model.task;

public class Task {
    private final String description;
    private final String deadline;

    /**
     * Initializes a Task with a description and deadline.
     */
    public Task(String description, String deadline) {
        this.description = description;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task: " + this.description + " " + deadline;
    }
}