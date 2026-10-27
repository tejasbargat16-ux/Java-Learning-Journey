import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadingPractice {
    static String readNotes() throws IOException {
        return Files.readString(Path.of("notes.txt"));
    }

    public static void main(String[] args) {
        try {

            System.out.println(readNotes());

        } catch (IOException e) {
            System.out.println(
                    "Unable to read notes.txt: " +
                    e.getMessage()
            );
        }
    }
}
