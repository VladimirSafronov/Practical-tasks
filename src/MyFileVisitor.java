import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
    List<Path> files = new ArrayList<>();

    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (file.getFileName().toString().endsWith(".txt")) {
            files.add(file);
        }
        return FileVisitResult.CONTINUE;
    }
}