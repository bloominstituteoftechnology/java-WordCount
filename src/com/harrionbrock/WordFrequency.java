package com.harrionbrock;

import java.util.*;
import java.util.Map.Entry;

class WordFrequency {
    private String text;
    private Map<String, Integer> wordCount = new HashMap<>();
    WordFrequency(String text) {
        this.text = text;
        cleanText();
        addWordsToMap();
    }

    private void cleanText() {
        this.text = this.text.toLowerCase().replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");
//        return this.text;
    }

    private void addWordsToMap() {
        String[] words = this.text.split(" +");
        for (String word : words) {
            wordCount.compute(word, (k, v) -> v == null ? 1 : v + 1);
        }
    }

    public void printAllWordCount() {
        Set<Entry<String, Integer>>  hastSet = wordCount.entrySet();
        for (Entry entry : hastSet) {
            System.out.println("Word: " + entry.getKey() + " | " + "Count: " + entry.getValue());
        }
    }

    public void printTo50Words() {

    }

    public HashMap<String, Integer> sortByValue(HashMap<String, Integer> wordMap) {

        List<Map.Entry<String, Integer>> list = new LinkedList<>();

        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        HashMap<String, Integer> sortedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    String getCleanInput() {
        return this.text;
    }
}
