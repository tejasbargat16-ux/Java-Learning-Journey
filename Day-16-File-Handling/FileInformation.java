import java.io.File;

public class FileInformation {

    public static void main(String[] args) {

        File file = new File("data.txt");

        if (file.exists()) {

            System.out.println("File name: " + file.getName());

            System.out.println("Path: " + file.getAbsolutePath());

            System.out.println("Size: " + file.length() + " bytes");

            System.out.println("Readable: " + file.canRead());

            System.out.println("Writable: " + file.canWrite());

            System.out.println("Is file: " + file.isFile());

        } else {

            System.out.println("File does not exist.");
        }
    }
}