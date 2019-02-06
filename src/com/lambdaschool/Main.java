package com.lambdaschool;

import java.io.File;
import java.io.IOException;
import java.util.*;

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
//        System.out.println("loop compiled successfully");
        ArrayList<HashMap.Entry<String, Integer>> sortedMap =
                new ArrayList<>();
        sortedMap.addAll(wordCountHashMap.entrySet());

        Collections.sort(sortedMap, new Comparator<HashMap.Entry<String, Integer>>() {
            public int compare(HashMap.Entry<String, Integer> o1, HashMap.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        System.out.println("\t\t   Word\t\tValue");
        for (int i = 0; i < 50; i++) {
            System.out.printf("\n%15s %8d", sortedMap.get(i).getKey(),
                    sortedMap.get(i).getValue());
        }
    }

}
