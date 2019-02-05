package com.lambdaschool.wordcount;


import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws  Exception
    {
	// write your code here
        Path path = Paths.get(System.getProperty("user.dir")).resolve("humanrights.txt");
        BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
        Map<String, Integer> frequency = new HashMap<>();

        String line = reader.readLine();
        while(line != null) {
            System.out.println("Processing line: " + line);

//            if(!line.trim().equals("")) {
//                String [] words = line.split(" ");
//            }



            String [] words = line.split(" ");

        }
    }
}
