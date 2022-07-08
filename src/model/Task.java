package model;

import exception.TaskNotCreatedException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Task {

    private final String taskName;

    private final LocalDate startDate;

    private final String deadline;


    public Task () {
        this.taskName = "";
        this.startDate = LocalDate.now();

        this.deadline = "today";
    }

    public Task(String taskName) throws TaskNotCreatedException {
        if (taskName.equals("")) {
            throw new TaskNotCreatedException("Task name cannot be empty String");
        }
        this.taskName = taskName;
        this.startDate = LocalDate.now();

        this.deadline = "today";
    }

    public Task (String taskName, String deadline) {
        this.taskName = taskName;
        this.startDate = LocalDate.now();

        this.deadline = deadline;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public LocalDate getStartDate () { return this.startDate; }

    public String getDeadline() {
        return this.deadline;
    }

}
