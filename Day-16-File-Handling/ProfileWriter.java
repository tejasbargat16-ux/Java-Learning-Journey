import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ProfileWriter {

    public static void main(String[] args) {

        Path path = Path.of("MyProfile.txt");

        String profile =
                "Name: Tejas\n" +
                "Branch: ECE\n" +
                "Skills: Java, Python, C++\n" +
                "Goal: Become a Software Developer";

        try {

            Files.writeString(path, profile);

            System.out.println(
                    "Profile saved successfully."
            );

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}