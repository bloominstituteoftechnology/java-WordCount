package com.harrionbrock;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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

    String getCleanInput() {
        return this.text;
    }
}
