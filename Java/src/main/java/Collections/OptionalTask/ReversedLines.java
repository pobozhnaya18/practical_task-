package Collections.OptionalTask;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class ReversedLines {
    public static void main(String[] args) {
        Deque<String> fileLines = new ArrayDeque<>();
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader("src/main/resources/data/CollectionsReverseLines.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileLines.push(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(fileLines.toString());
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter("src/main/resources/data/CollectionsReverseLines.txt"))) {
            while (!fileLines.isEmpty()) {
                bufferedWriter.write(fileLines.pop());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
