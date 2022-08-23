import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Deadline extends Task {
    LocalDate date;

    Deadline(String task_description, LocalDate date) {
        super(task_description);
        this.date = date;
    }

    Deadline(String task_description, boolean done, String date) {
        super(task_description, done);
        this.date = date;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + this.date.format(DateTimeFormatter.
                ofPattern("MMM dd yyyy")) + ")";}
}
