import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesExample {

    public static void main(String[] args) {

        Path path = Path.of("message.txt");

        try {

            Files.writeString(
                    path,
                    "Hello Tejas!\nWelcome to Day 16."
            );

            System.out.println("File saved.");

            String content = Files.readString(path);

            System.out.println("\nFile content:");
            System.out.println(content);

        } catch (IOException e) {

            System.out.println(
                    "File error: " + e.getMessage()
            );
        }
    }
}