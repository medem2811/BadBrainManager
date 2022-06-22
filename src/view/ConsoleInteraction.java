package view;

import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class ConsoleInteraction implements UserInteraction {

    private List<String> userActions;

    @Override
    public void showWelcomeMessage() {
        System.out.println("Welcome to the BadBrainManager!");
    }

    @Override
    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public void setUserActions(List<String> actionLabels) {
        this.userActions = actionLabels;
    }

    @Override
    public void chooseAction() {
        System.out.println("Please choose from the following actions: ");
        for (String s : userActions) {
            System.out.println("\"" + s + "\"");
        }
    }

    @Override
    public void showGoodbyeMessage() {
        System.out.println("Thank you for using BadBrainManager!");
    }

    @Override
    public void showTaskPrompt() {
        System.out.println("Please enter a task in the following format:\n[name],[dd.MM.yyyy]");
    }

    @Override
    public void showTable(String[][] table) {
        System.out.println("Name\t\t\tDeadline");
        for (String[] strings : table) {
            for (String s : strings) {
                System.out.print(s + "\t\t\t");
            }
            System.out.print("\n");
        }
    }

    @Override
    public void showErrorMessage() {
        System.out.println("Whoopsie! Something went wrong!");
    }

}
