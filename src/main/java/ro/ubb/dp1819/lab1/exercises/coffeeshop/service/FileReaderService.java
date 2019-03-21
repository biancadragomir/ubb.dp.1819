package ro.ubb.dp1819.lab1.exercises.coffeeshop.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService {
    private String fileName;

    public FileReaderService(String fileName) {
        this.fileName = fileName;
    }

    public List<String> returnFileAsList(){
        File file = new File("D:\\Work\\Facultate\\an3sem2\\dp01-coffee\\src\\in_file.txt");
        BufferedReader br;
        String st;
        List<String> listOfStrings= new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(file));
            while ((st = br.readLine()) != null){
                System.out.println(st);
                listOfStrings.add(st);
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        return listOfStrings;
    }


}
