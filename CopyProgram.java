package ru.innopolis.university.mingaleev.homework_18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static java.nio.charset.StandardCharsets.ISO_8859_1;
import static java.nio.charset.StandardCharsets.UTF_8;

public class CopyProgram {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader (String.valueOf(UTF_8));
             FileWriter fileWriter = new FileWriter(String.valueOf(ISO_8859_1))) {
            char[] buffer = new char[1024];
            while (true) {
                int numberOfReadChars = fr.read(buffer, 0, buffer.length);
                if (numberOfReadChars == -1) {
                    break;
                }
                fileWriter.write(buffer, 0, numberOfReadChars);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
