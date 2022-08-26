package duke.command;

import duke.task.Task;
import duke.DukeException;
import duke.Storage;
import duke.TaskList;
import duke.Ui;

public class AddCommand extends Command {
    private Task task;
    public AddCommand(Task task) {
        this.task = task;
    }
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        tasks.add(task);
        ui.addTaskMessage(task, tasks);
        storage.save(tasks.toString());
    }
}
