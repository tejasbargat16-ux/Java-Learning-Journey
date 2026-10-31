import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {

        try {

            FileWriter writer =
                    new FileWriter("data.txt");

            writer.write("Hello Java!\n");
            writer.write("Day 16 - File Handling\n");
            writer.write("Learning Java programming.");

            writer.close();

            System.out.println(
                    "Data written successfully."
            );

        } catch (IOException e) {

            System.out.println(
                    "Writing error: " + e.getMessage()
            );
        }
    }
}