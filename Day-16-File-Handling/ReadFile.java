import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {

        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader("data.txt"))) {

            String line;

            System.out.println("===== FILE CONTENT =====");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {

            System.out.println(
                    "Reading error: " + e.getMessage()
            );
        }
    }
}