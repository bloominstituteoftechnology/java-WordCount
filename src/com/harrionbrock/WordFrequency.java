package com.harrionbrock;

import java.util.HashMap;
import java.util.Map;

class WordFrequency {
    private String text;
    private Map<String, Integer> wordCount = new HashMap<>();
    WordFrequency(String text) {
        this.text = text;
        cleanText();
        addWordsToMap();
    }

    private void cleanText() {
        this.text = this.text.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");
//        return this.text;
    }

    private void addWordsToMap() {
        String[] words = this.text.split(" +");
        for (String word : words) {
            wordCount.compute(word, (k, v) -> v == null ? 1 : v + 1);
        }
    }

    String getCleanInput() {
        return this.text;
    }
}
