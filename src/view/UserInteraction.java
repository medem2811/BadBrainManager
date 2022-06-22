package view;

import java.util.List;

public interface UserInteraction {

    void showWelcomeMessage();

    String getUserInput();

    void setUserActions(List<String> actionLabels);

    void chooseAction();

    void showGoodbyeMessage();

    void showTaskPrompt();

    void showTable(String[][] table);

    void showErrorMessage();

}
