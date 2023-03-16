package java11.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileService {

    boolean isFileContainsText(Path path, String searchingText) throws IOException {
        // implement here
        // read file content and return true if searchingText found
        String read = Files.readString(path);
        return read.contains(searchingText);
    }
}
