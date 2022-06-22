package model;

import java.util.ArrayList;

public class TaskCollection {

    private final ArrayList<Task> tasklist;


    public TaskCollection () {
        tasklist = new ArrayList<>();
    }

    public void addTask(String taskName, String deadline) {
        tasklist.add(new Task(taskName, deadline));
    }

    public ArrayList<Task> getTasklist() {
        return this.tasklist;
    }

}
