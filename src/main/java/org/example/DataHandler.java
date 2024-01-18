package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class DataHandler {

    //tight coupling
    DataCollector dataCollector = new DataCollector();
//    TxtFileManager txtFileManager = new TxtFileManager();
//    JsonFileManager jsonFileManager = new JsonFileManager();


    public void getReport(FileManager fileManager) {
        Map<String, String> data = dataCollector.getMapData();
        fileManager.saveReport(data);
//        switch (reportType) {
//            case "text":
//                txtFileManager.saveReport(data);
//                break;
//            case "json":
//                jsonFileManager.saveReport(data);
//                break;
//        }

    }

}
