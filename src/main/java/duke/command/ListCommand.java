package duke.command;

import duke.DukeException;
import duke.Storage;
import duke.TaskList;
import duke.Ui;

/**
 * Represents a command to display the task list
 */
public class ListCommand extends Command {

    /**
     * Displays task list
     *
     * @param tasks List of task
     * @param ui User interface of programme
     * @param storage Storage of programme
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        ui.displayTasks(tasks);
    }
}
