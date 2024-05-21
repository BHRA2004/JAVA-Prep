import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

public class CheckEmptyFile {
    public static void main(String[] args) {
        try {
            // Provide the path to the file you want to read
            String filePath = "path/to/your/file.txt";

            // Read the file
            String fileContent = readFile(filePath);

            // Check if the file is empty
            if (fileContent.isEmpty()) {
                throw new EmptyFileException("The file is empty.");
            }

            // Process the file content (in this example, just printing it)
            System.out.println("File content:\n" + fileContent);
        } catch (EmptyFileException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Unexpected exception occurred.");
        }
    }

    private static String readFile(String filePath) throws IOException {
        StringBuilder fileContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
        }
        return fileContent.toString();
    }
}