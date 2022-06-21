package task;

import java.util.ArrayList;

public class Project {

    private String name;

    private ArrayList<Task> tasklist;


    public Project (String name) {
        this.name = name;
        tasklist = new ArrayList<Task>();
    }

    public void addTask(String taskName, String deadline) {
        tasklist.add(new Task(taskName, deadline));
    }

    public ArrayList<Task> getTasklist() {
        return this.tasklist;
    }

}
