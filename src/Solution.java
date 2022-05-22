import java.io.*;
import java.nio.file.*;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Path startDir = Paths.get(scan.nextLine());

        MyFileVisitor visitor = new MyFileVisitor();
        Files.walkFileTree(startDir, visitor);

        File myFile = new File(scan.nextLine()); //"endFile.txt"
        BufferedWriter writer = new BufferedWriter(new FileWriter(myFile));

        for (Path f : visitor.files) {
            BufferedReader reader = new BufferedReader(new FileReader(f.toString()));
            String line = reader.readLine();
            while (line != null) {
                writer.write(line + "\n");
                line = reader.readLine();
            }
        }
        writer.close();
        scan.close();
    }
}

