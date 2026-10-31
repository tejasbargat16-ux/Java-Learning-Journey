import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordCounter {

    public static void main(String[] args) {

        Path path = Path.of("MyProfile.txt");

        try {

            String content = Files.readString(path).trim();

            int wordCount;

            if (content.isEmpty()) {
                wordCount = 0;
            } else {
                wordCount = content.split("\\s+").length;
            }

            System.out.println(
                    "Total words: " + wordCount
            );

        } catch (IOException e) {

            System.out.println(
                    "File error: " + e.getMessage()
            );
        }
    }
}