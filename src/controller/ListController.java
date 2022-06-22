package controller;

import model.Action;
import model.Task;
import model.TaskCollection;
import view.ConsoleInteraction;
import view.UserInteraction;

import java.util.ArrayList;
import java.util.List;

public class ListController {

    private final UserInteraction userInteraction;

    private final TaskCollection taskCollection;

    public ListController () {
        this.taskCollection = new TaskCollection();
        userInteraction = new ConsoleInteraction();
    }

    public void init() {
        userInteraction.setUserActions(getActionsAsList());
        userInteraction.showWelcomeMessage();
        nextAction();
    }

    public void nextAction() {
        userInteraction.chooseAction();
        String input = userInteraction.getUserInput();
        switch (parseAction(input)) {
                case EXIT:
                    exitProgram();
                    break;
                case ADD_TASK:
                    addNewTaskToList();
                    break;
                case SHOW_TASKS:
                    showListToUser();
                    break;
                default:
                    userInteraction.chooseAction();
                    nextAction();
            }
    }

    public Action parseAction(String input) {
        try {
            return Action.valueOf(input);
        } catch (IllegalArgumentException e) {
            userInteraction.showErrorMessage();
            return null;
        }
    }

    private List<String> getActionsAsList() {
        List<String> actionList = new ArrayList<>();
        for (Action a : Action.values()) {
            actionList.add(a.name());
        }
        return actionList;
    }

    public void exitProgram() {
        userInteraction.showGoodbyeMessage();
        System.exit(0);
    }

    public void addNewTaskToList() {
        userInteraction.showTaskPrompt();
        parseInputAsTask(userInteraction.getUserInput());
        nextAction();
    }

    private void parseInputAsTask(String userInput) {
        if (checkValidTask(userInput)) {
            String [] taskDetails = userInput.split(",");
            taskCollection.addTask(taskDetails[0], taskDetails[1]);
        } else {
            addNewTaskToList();
        }
    }

    private boolean checkValidTask(String input) {
        if (input.matches("^[a-zA-Z\\d\\s]+,\\s?[1-3]\\d\\.[0-2]\\d\\.\\d{4}")) {
            return true;
        } else {
            userInteraction.showErrorMessage();
        }
        return false;
    }

    public void showListToUser() {
        ArrayList<Task> taskList = taskCollection.getTasklist();
        String[][] taskTable = new String[taskList.size()][2];

        for (int i = 0; i < taskTable.length; i++) {
            taskTable[i][0] = taskList.get(i).getTaskName();
            taskTable[i][1] = taskList.get(i).getDeadline();
        }

        userInteraction.showTable(taskTable);
        nextAction();
    }





}
