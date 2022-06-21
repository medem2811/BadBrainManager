package task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {

    private String taskName;

    private long startDate;

    private Date deadline;

    public Task (String taskName, String deadline) {
        this.taskName = taskName;
        parseDate(deadline);
        this.startDate = new Date().getTime();
    }

    private void parseDate(String date) {
        String format = "dd.MM.yyyy HH:mm";
        SimpleDateFormat sdf = new SimpleDateFormat(format);

        try {
            this.deadline = sdf.parse(date);
        } catch (ParseException e) {
            System.err.println("ERROR: Could not parse the date");
            e.printStackTrace();
        }
    }
}
