# ☕ Day 16 — File Handling

## 🎯 Concept
**File Handling** in Java allows programs to persist data across application restarts by interacting directly with the filesystem. Java provides both classic I/O streams (`File`, `FileReader`, `FileWriter`, `BufferedReader`) and modern NIO.2 APIs (`java.nio.file.Files`, `Path`, `Paths`) for reading, writing, appending, creating, and inspecting files and directories.

## 🧠 Key Points
- **`File` Class:** Represents file and directory pathnames. Provides metadata methods (`exists()`, `getName()`, `getAbsolutePath()`, `length()`, `isFile()`, `isDirectory()`).
- **File Creation:** `file.createNewFile()` creates a new empty file if it doesn't already exist.
- **Writing Data:**
  - `FileWriter`: Writes character streams to files. Overwrites by default.
  - Append Mode: Pass `true` as the second argument (`new FileWriter(file, true)` or `new FileWriter("path", true)`) to append text rather than overwrite.
- **Reading Data:**
  - `Scanner`: Convenient for token-based reading from a `File` instance.
  - `BufferedReader`: Reads text line by line using `.readLine()`, offering superior performance for large files.
- **Modern NIO.2 (`java.nio.file.Files`):** Provides static helper methods like `Files.writeString()`, `Files.readString()`, and `Files.exists()`.
- **Directory Operations:** `file.mkdir()` creates a single directory; `file.mkdirs()` creates parent directories as needed.
- **Checked Exceptions:** File operations throw `IOException`, which must be handled using `try-catch` or declared using `throws`.

## 💻 Code Example
```java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("demo.txt");

        try {
            // Write (or append with true)
            FileWriter writer = new FileWriter(file, true);
            writer.write("Persisting data in Java!\n");
            writer.close(); // always flush/close streams

            // Read
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
```
*(from `CreateFile.java`, `WriteFile.java` & `ReadFile.java`)*

## 🧪 Programs Written
| File | What it does |
|---|---|
| `CreateFile.java` | Creates new files using File.createNewFile() |
| `WriteFile.java` | Writes character data using FileWriter |
| `AppendFile.java` | Appends text content without overwriting existing data |
| `ReadFile.java` | Reads file content line by line using Scanner / FileReader |
| `FilesExample.java` | Uses modern java.nio.file Files and Path APIs |
| `FileInformation.java` | Inspects file properties (size, path, permissions, existence) |
| `DirectoryManager.java` | Creates, lists, and manages directory structures |
| `NotesManager.java` | Mini-project: CLI personal notes manager with persistent file storage |
| `ProfileWriter.java` | Writes structured user profile details to disk |
| `ProfileReader.java` | Reads and parses user profile files back into memory |
| `WordCounter.java` | Reads a file and counts total words and lines |

## ⚠️ Common Mistakes
- Forgetting to `close()` or `flush()` writers (`FileWriter` buffers data; unclosed streams leave empty files or corrupt output).
- Not passing `true` when appending (`new FileWriter("file.txt")` immediately wipes existing contents).
- Relying on relative paths without knowing the working directory, causing `FileNotFoundException`.
- Reading entire massive files into memory at once instead of streaming with `BufferedReader`.
- Forgetting to handle `IOException` when invoking file I/O operations.

## ❓ Interview Questions
- **Q: What is the difference between `FileReader` and `BufferedReader`?**  
  A: `FileReader` reads characters directly from disk one by one, resulting in frequent I/O operations. `BufferedReader` wraps a reader and buffers chunks of characters in memory, offering faster reading and handy helper methods like `readLine()`.
- **Q: How do you append text to an existing file in Java?**  
  A: Pass `true` as the second argument to `FileWriter`: `new FileWriter("filename.txt", true)`.
- **Q: What is the benefit of Java NIO.2 (`Files` and `Path`) over classic `File`?**  
  A: NIO.2 provides non-blocking operations, better error reporting, unified path handling across OS platforms, and simple one-liner methods like `Files.readString()` and `Files.writeString()`.
- **Q: What is try-with-resources and why should it be used with file I/O?**  
  A: Try-with-resources automatically closes any resource implementing `AutoCloseable` at the end of the statement block, preventing resource leaks even when exceptions occur.

## 🔗 Practice Code
[📁 Day-16-File-Handling](../Day-16-File-Handling)

---
*🤖 Auto-generated note*
