import exception.TaskNotCreatedException;
import model.Task;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.time.LocalDate;

public class TaskCreatorTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();


    @Test()
    public void createEmptyTaskAndVerifyTaskCouldNotBeCreated() throws TaskNotCreatedException {
        exceptionRule.expect(TaskNotCreatedException.class);
        exceptionRule.expectMessage("cannot be empty String");
        Task task = new Task("");
    }

    @Test
    public void createTaskWithoutStartDateAndVerifyStartDateIsNotNull() throws TaskNotCreatedException {
        Task task = new Task("Task Name Test");

        Assert.assertNotNull("Empty Start Date in Task could not be created", task);
        Assert.assertNotNull("Task doesn't have a start date", task.getStartDate());
    }

    @Test
    public void createTaskAndVerifyStartDateDefaultIsCurrentDate() throws TaskNotCreatedException {
        LocalDate today = LocalDate.now();
        Task task = new Task("Task Name Test");

        Assert.assertNotNull("Empty Task could not be created", task);
        Assert.assertNotNull("Task doesn't have a start date", task.getStartDate());
        Assert.assertEquals("Default Start Date is not current Date", today, task.getStartDate());
    }

    @Test
    public void createTaskWithoutDeadlineAndVerifyDeadlineIsNull() {
        //TODO
        Assert.fail();
    }

    @Test
    public void createTaskWithoutAnyDateAndVerifyDefaultStartDateAndDeadline() {
        //TODO
        Assert.fail();
    }

    @Test
    public void createTaskWithDeadline() {
        //TODO
        Assert.fail();
    }

    @Test
    public void createTaskWithNotAcceptedDeadline() {
        //TODO
        Assert.fail();
    }

    @Test
    public void changeTaskName() {
        //TODO
        Assert.fail();
    }

    @Test
    public void changeTaskStartDate() {
        //TODO
        Assert.fail();
    }

    @Test
    public void changeTaskStartToPastDateAndVerifyExceptionThrown() {
        //TODO
        Assert.fail();
    }



}
