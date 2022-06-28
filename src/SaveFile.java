import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SaveFile {

    private final String filename;

    private FileWriter file;

    public SaveFile() {
        filename = "testfile.txt";
        try {
            file = new FileWriter(filename);
        } catch (IOException e) {
            e.printStackTrace();
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
}
