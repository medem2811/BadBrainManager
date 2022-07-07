import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SaveFile {

    private final String filename;

    private FileWriter file;

    private File saveFile;

    public SaveFile() {
        filename = "testfile.txt";
        try {
            file = new FileWriter(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SaveFile(File file) {
        this.saveFile = file;
        filename = file.getName();
    }

    public static SaveFile loadFile(String filename) {
        try {
            FileReader reader = new FileReader(filename);
            return new SaveFile(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println(String.format("File with name %s could not be found", filename));
            return null;
        }
    }

    public void write(String textToWrite) {
        PrintWriter out = new PrintWriter(this.file);
        out.println(textToWrite);
        out.close();
    }

    public String getDataAsString(){
        File file = new File(this.filename);
        String output = "";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                output = output.concat(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return output;
    }

    public void deleteFile() {
        try {
            Files.deleteIfExists(saveFile.toPath());
        } catch (IOException e) {
            System.out.println(String.format("Could not delete file %s", saveFile.getName()));
        }
    }
}
