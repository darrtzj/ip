package duke.task;

import duke.DukeException;

/**
 * Represents a task
 */
public class Task {

    private final String taskDescription;
    private boolean isDone;
    private static final String ALREADY = "This task is already marked as ";

    Task(String taskDescription) {
        this.taskDescription = taskDescription;
        this.isDone = false;
    }

    Task(String taskDescription, boolean isDone) {
        this.taskDescription = taskDescription;
        this.isDone = isDone;
    }

    /**
     * Marks task as done.
     *
     * @throws DukeException If task is done
     */
    public void doing() throws DukeException {
        if (!this.isDone) {
            this.isDone = true;
        } else {
            throw new DukeException(ALREADY + "done");
        }
    }

    /**
     * Unmarks task as not done.
     *
     * @throws DukeException If task is not done
     */
    public void undo() throws DukeException {
        if (this.isDone) {
            this.isDone = false;
        } else {
            throw new DukeException(ALREADY + "not done");
        }
    }

    /**
     * Returns task description
     *
     * @return task description
     */
    public String getDescription() {
        return this.taskDescription;
    }

    /**
     * Returns task status
     *
     * @return task status
     */
    public boolean isDone() {
        return this.isDone;
    }

    /**
     * Returns task
     *
     * @return task
     */
    @Override
    public String toString() {
        String marker;
        if (this.isDone) {
            marker = "X";
        } else {
            marker = " ";
        }
        return "[" + marker + "] " + this.taskDescription;
    }
}
