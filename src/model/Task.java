package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {

    private final String taskName;

    private final String deadline;

    public Task (String taskName, String deadline) {
        this.taskName = taskName;
        this.deadline = deadline;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public String getDeadline() {
        return this.deadline;
    }

}
