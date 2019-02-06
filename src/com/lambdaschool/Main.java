package com.lambdaschool;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File myfile = new File("myinput.txt");
        Scanner inputFile = new Scanner(myfile);

        String str = inputFile.nextLine();
        str.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");
        String[] words = str.split(" +");

        HashMap <String, Integer> wordCountHashMap = new HashMap<>();

        for (String word:words) {
            if (!wordCountHashMap.containsKey(word)) {
                wordCountHashMap.put(word, 1);
            } else {
                int count = wordCountHashMap.get(word);
                wordCountHashMap.put(word, count + 1);
            }
        }
        System.out.println("loop compiled successfully");
    }
}
