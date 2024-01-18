package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class TxtFileManager implements FileManager {
    @Override
    public void saveReport(Map<String, String> data) {
        try {
            FileWriter fileWriter = new FileWriter("myReport.txt");
            for (Map.Entry<String, String> item : data.entrySet()) {
                fileWriter.write(item.getKey() + " -> " + item.getValue() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("natoonestam file ra besazam");
        }
    }
}
