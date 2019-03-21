package ro.ubb.dp1819.lab1.exercises.coffeeshop.service;

import java.util.ArrayList;
import java.util.List;

public class CoffeeInterpreterService {
    FileReaderService fileReaderService;
    List<String> fileContentsAsList;

    public CoffeeInterpreterService(String fileName) {
        this.fileReaderService = new FileReaderService(fileName);
        fileContentsAsList = new ArrayList<>();
        fileReaderService.returnFileAsList();
    }

    public boolean checkFileIsOk(){
        // if the number of words from a line is different from 3 or 4 => the file structure is not correct

        for(String line: fileContentsAsList){
            if(line.split(",").length != 3 && line.split(",").length != 4)
                return false; // then the line contains less than / more than 3 / 4 words
        }
        return true;
    }





}
