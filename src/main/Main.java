package main;

import task.Project;
import task.Task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello and welcome to the Bad Brain Manager!\nPlease add a project name:");
        Scanner scanner = new Scanner(System.in);

        String projectName = scanner.nextLine();
        Project project = new Project(projectName);

        boolean moreTasksToAdd;
        do {
            System.out.println("Please add a task:");
            String taskName = scanner.nextLine();

            System.out.println("Now please add a deadline (dd.MM.yyyy HH:mm):");
            String deadline = scanner.nextLine();

            project.addTask(taskName, deadline);

            for (Task task : project.getTasklist()) {
                System.out.println(task.getTaskName() + ": " + task.getStartDate() + " - " + task.getDeadline());
            }
            System.out.println("\nDo you want to add another task? (y/n)");
            String answer = scanner.nextLine();
            moreTasksToAdd = answer.equals("y");

        } while (moreTasksToAdd);




    }
}
