package com.lambdaschool.wordcount2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        Words text = new Words();
        String allWords = text.getWords();
        System.out.println("before regexp: " + allWords);
        String cleanText = allWords.replaceAll("[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']", "");

        Map<String, Integer> wordHashMap = new HashMap<>();
        List<String> myList = new ArrayList<String>(Arrays.asList(cleanText.split(" ")));
        for (String word : myList)
        {
            if(wordHashMap.containsKey(word))
            {
                wordHashMap.put(word, wordHashMap.get(word) + 1);
            } else {
                wordHashMap.put(word,1);
            }
        }
        System.out.println("hashed: " + wordHashMap);



        int counter = 1;

        while(counter < 51) {
            int biggestValue = 0;
            String theMostFrequentWord = null;
            for(String word : wordHashMap.keySet())
            {
                int currentValue = wordHashMap.get(word);
                if(currentValue > biggestValue)
                {
                    biggestValue = currentValue;
                    theMostFrequentWord = word;
                }
            }
            System.out.println("(" + counter + ") The most frequent word is: " + theMostFrequentWord + ", appears: " + biggestValue);
            wordHashMap.remove(theMostFrequentWord);
            counter++;
        }
    }
}
