package duke;

import java.util.Scanner;

import duke.task.Task;

/**
 * Represents the user interface.
 */
public class Ui {

    private static final String GREETINGS_MESSAGE = "Hello! I'm Duke\n" + "What can I do for you?";
    private static final String EXIT_MESSAGE = "Bye. Hope to see you again soon!";
    private static final String LINE = "______________________________________________________________________________";
    private static final String LIST_MESSAGE = "Here are the tasks in your list:";
    private static final String ADD_MESSAGE = "Got it. I've added this task:";
    private static final String DELETE_MESSAGE = "Noted. I've removed this task:";
    private static final String DONE_MESSAGE = "Nice! I've marked this task as done:";
    private static final String UNDONE_MESSAGE = "OK, I've marked this task as not done yet:";
    private static final String FIND_MESSAGE = "Here are the matching tasks in your list:";

    private Scanner sc = new Scanner(System.in);

    /**
     * Prints greeting message.
     */
    protected String greet() {
        return GREETINGS_MESSAGE;
    }

    /**
     * Prints exit message.
     */
    public String exit() {
        return EXIT_MESSAGE;
    }

    /**
     * Prints line break.
     */
    protected void showLine() {
        System.out.println(LINE);
    }

    /**
     * Prints error message.
     *
     * @param message Error message.
     */
    protected String showError(String message) {
        return message;
    }

    /**
     * Prints add task message.
     *
     * @param task Target task.
     * @param tasks Task list.
     */
    public String addTaskMessage(Task task, TaskList tasks) {
        return ADD_MESSAGE + "\n" + task.toString() + "\n" + "Now you have " + tasks.size() + " tasks in the list.";
    }

    /**
     * Displays all task in task list.
     *
     * @param tasks Task list.
     */
    public String displayTasks(TaskList tasks) throws DukeException {
        String response = "";
        response = response + LIST_MESSAGE;
        for (int i = 1; i <= tasks.size(); i++) {
            response = response + "\n" + i + ". " + tasks.get(i - 1).toString();
        }
        return response;
    }

    /**
     * Prints delete task message.
     *
     * @param task Task to be deleted.
     * @param tasks Task list.
     */
    public String deleteTaskMessage(Task task, TaskList tasks) {
        return DELETE_MESSAGE + "\n" + task.toString() + "\n" + "Now you have " + tasks.size() + " tasks in the list.";
    }

    /**
     * Prints mark done message.
     *
     * @param task Target task.
     */
    public String markDone(Task task) {
        return DONE_MESSAGE + "\n" + task.toString();
    }

    /**
     * Prints mark undone message.
     *
     * @param task Target task.
     */
    public String markUndone(Task task) {
        return UNDONE_MESSAGE + "\n" + task.toString();
    }

    /**
     * Prints find task message.
     *
     * @param tasks Task list.
     */
    public String findTask(TaskList tasks) throws DukeException {
        String response = "";
        response = response + FIND_MESSAGE;
        for (int i = 1; i <= tasks.size(); i++) {
            response = response + "\n" + i + ". " + tasks.get(i - 1).toString();
        }
        return response;
    }

    /**
     * Reads user's input.
     *
     * @return user's input.
     */
    protected String readCommand() {
        return sc.nextLine();
    }
}
