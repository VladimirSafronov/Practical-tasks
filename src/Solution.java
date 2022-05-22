import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Path startDir = Paths.get(scan.nextLine());

        MyFileVisitor visitor = new MyFileVisitor();
        Files.walkFileTree(startDir, visitor);

//        for (Path file : visitor.files) {
//            System.out.println(file.toString());
//        }


    }
}

