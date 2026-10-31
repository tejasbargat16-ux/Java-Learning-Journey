import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProfileReader {

    public static void main(String[] args) {

        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader("MyProfile.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {

            System.out.println(
                    "Unable to read profile: " + e.getMessage()
            );
        }
    }
}