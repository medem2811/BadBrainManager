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

    @Test
    public void loadExistingFile() {
        new SaveFile();

        String filename = "testfile.txt";
        SaveFile file = SaveFile.loadFile(filename);
        Assert.assertNotNull("File was not loaded.", file);
    }

    @Test
    public void deleteSaveFile() {
        String filename = "testfile.txt";
        SaveFile file = SaveFile.loadFile(filename);
        file.deleteFile();
        Assert.assertNull("File was not deleted.", file.loadFile(filename));
    }
}
