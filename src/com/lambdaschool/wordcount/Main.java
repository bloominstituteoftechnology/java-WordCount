package com.lambdaschool.wordcount;


import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
            if(!line.trim().equals("")) {
                String [] words = line.split(" ");
                for(String word: words)
                {
                    if(word == null || word.trim().equals("")){
                        continue;
                    }
                    String processed = word.toLowerCase();
                    if(frequency.containsKey(processed)) {
                        frequency.put(
                                processed,
                                frequency.get(processed) + 1
                        );
                    } else {
                        frequency.put(processed, 1);
                    }
                }
            }
            line = reader.readLine();
        }
        System.out.println(frequency);


        int removeCounter = 1;
        while(removeCounter < 51)
        {
            int mostFrequent = 0;
            String theWord = null;
            for (String word : frequency.keySet())
            {
                Integer theVal = frequency.get(word);
                if (theVal > mostFrequent)
                {
                    mostFrequent = theVal;
                    theWord = word;
                }
            }
            System.out.println("(" + removeCounter + ") The most frequent word is: '" + theWord + "' appears: " + mostFrequent);

            frequency.remove(theWord);
            removeCounter++;
        }
    }
}
