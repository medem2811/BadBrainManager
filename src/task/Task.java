package task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {

    private String taskName;

    private String startDate;

    private String deadline;

    public Task (String taskName, String deadline) {
        this.taskName = taskName;
        this.startDate = "today";
        this.deadline = deadline;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public String getStartDate() {
        return this.startDate;
    }


}
