import org.junit.Assert;
import org.junit.Test;

public class SaveIntoFileTest {

    @Test
    public void writeTextIntoFile() {
        String testInput = "I am a Test!";
        SaveFile file = new SaveFile();
        file.write(testInput);
        Assert.assertTrue("Message was not written in File", file.getDataAsString().contains(testInput));
    }
}
