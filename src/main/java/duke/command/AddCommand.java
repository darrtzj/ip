package duke.command;

import duke.DukeException;
import duke.Storage;
import duke.TaskList;
import duke.Ui;
import duke.task.Task;

/**
 * Represents a command of adding task.
 */
public class AddCommand extends Command {

    private Task task;

    /**
     * Constructs an add command.
     *
     * @param task task to be added.
     */
    public AddCommand(Task task) {
        this.task = task;
    }

    /**
     * Adds task to task list and saves task list.
     *
     * @param tasks List of task.
     * @param ui User interface of programme.
     * @param storage Storage of programme.
     * @throws DukeException If error saving file.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        tasks.add(task);
        ui.addTaskMessage(task, tasks);
        storage.save(tasks.toString());
    }
}
