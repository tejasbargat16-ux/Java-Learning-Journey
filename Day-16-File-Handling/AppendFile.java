import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

    public static void main(String[] args) {

        try (FileWriter writer =
                     new FileWriter("data.txt", true)) {

            writer.write("\nDay 16: Practicing file handling.");
            writer.write("\nJava is powerful!");

            System.out.println("Data appended successfully.");

        } catch (IOException e) {

            System.out.println(
                    "Append error: " + e.getMessage()
            );
        }
    }
}