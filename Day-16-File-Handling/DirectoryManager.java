import java.io.File;

public class DirectoryManager {

    public static void main(String[] args) {

        File directory = new File("JavaStorage");

        if (directory.mkdir()) {
            System.out.println("Directory created.");
        } else {
            System.out.println(
                    "Directory already exists or cannot be created."
            );
        }

        File file = new File(directory, "notes.txt");

        try {

            if (file.createNewFile()) {
                System.out.println("Notes file created.");
            } else {
                System.out.println("Notes file already exists.");
            }

        } catch (java.io.IOException e) {

            System.out.println(e.getMessage());
        }

        // Delete only the test file:
        // if (file.delete()) {
        //     System.out.println("Notes file deleted.");
        // }
    }
}