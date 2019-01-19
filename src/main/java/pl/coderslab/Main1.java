package pl.coderslab;

import java.io.IOException;
import java.net.FileNameMap;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("test");
        Path path = Paths.get("src/main/java/pl/coderslab/oop.txt");

        try{
            for (String line : Files.readAllLines(path)) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
