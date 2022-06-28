import model.Task;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class TaskCreatorTest {

    @Test
    public void createEmptyTaskAndVerifyNameIsNotNull() {
        Task task = new Task();
        Assert.assertNotNull("Empty Task could not be created", task);
        Assert.assertNotNull("Empty Task does not have empty String as name", task.getTaskName());
    }

    @Test
    public void createEmptyTaskAndVerifyStartDateIsNotNull() {
        Task task = new Task();

        Assert.assertNotNull("Empty Task could not be created", task);
        Assert.assertNotNull("Task doesn't have a start date", task.getStartDate());
    }

    @Test
    public void createEmptyTaskAndVerifyStartDateDefaultIsCurrentDate() {
        LocalDate today = LocalDate.now();
        Task task = new Task();

        Assert.assertNotNull("Empty Task could not be created", task);
        Assert.assertNotNull("Task doesn't have a start date", task.getStartDate());
        Assert.assertEquals("Default Start Date is not current Date", today, task.getStartDate());
    }

}
