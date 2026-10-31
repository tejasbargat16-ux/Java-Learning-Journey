import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class NotesManager {

    private static final Path FILE =
            Path.of("my-notes.txt");

    public static void addNote(String note)
            throws IOException {

        Files.writeString(
                FILE,
                note + System.lineSeparator(),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );

        System.out.println("Note saved successfully.");
    }

    public static void viewNotes() throws IOException {

        if (!Files.exists(FILE)) {
            System.out.println("No notes found.");
            return;
        }

        String content = Files.readString(FILE);

        if (content.isBlank()) {
            System.out.println("Your notes are empty.");
        } else {
            System.out.println("\n===== SAVED NOTES =====");
            System.out.println(content);
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            boolean running = true;

            while (running) {

                System.out.println("\n===== NOTES MANAGER =====");
                System.out.println("1. Add Note");
                System.out.println("2. View Notes");
                System.out.println("3. Exit");

                System.out.print("Choose option: ");

                String choice = scanner.nextLine();

                try {

                    switch (choice) {

                        case "1":

                            System.out.print("Enter your note: ");

                            String note = scanner.nextLine();

                            if (note.isBlank()) {
                                System.out.println(
                                        "Note cannot be empty."
                                );
                            } else {
                                addNote(note);
                            }

                            break;

                        case "2":

                            viewNotes();
                            break;

                        case "3":

                            running = false;

                            System.out.println(
                                    "Notes Manager closed."
                            );

                            break;

                        default:

                            System.out.println(
                                    "Invalid option."
                            );
                    }

                } catch (IOException e) {

                    System.out.println(
                            "Storage error: " + e.getMessage()
                    );
                }
            }
        }
    }
}