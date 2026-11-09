import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileIoExample {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("sample.txt");
        Files.writeString(file, "Hello from file I/O example");
        String content = Files.readString(file);
        System.out.println("File content: " + content);
    }
}
