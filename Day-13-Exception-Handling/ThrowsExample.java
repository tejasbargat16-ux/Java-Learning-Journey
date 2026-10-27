import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ThrowsExample {
    static String readFile() throws IOException {
        return Files.readString(
                Path.of("sample.txt")
        );
    }

    public static void main(String[] args) {

        try {
            String content = readFile();
            System.out.println(content);

        } catch (IOException e) {
            System.out.println(
                    "File error: " + e.getMessage()
            );
        }
    }
}
