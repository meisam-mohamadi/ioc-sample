package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class JsonFileManager implements FileManager {


    @Override
    public void saveReport(Map<String, String> data) {
        try {
            FileWriter fileWriter = new FileWriter("myReport.json");
            String myJson = new ObjectMapper().writeValueAsString(data);
            fileWriter.write(myJson);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("natoonestam file ra besazam");
        }
    }
}
