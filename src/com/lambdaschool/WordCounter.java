package com.lambdaschool;

public class WordCounter {
    private String word;
    private int occurrenceCounter;

    // practicing IntelliJ built-in 'Generate'
    public WordCounter(String word, int occurrenceCounter) {
        this.word = word;
        this.occurrenceCounter = occurrenceCounter;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getOccurrenceCounter() {
        return occurrenceCounter;
    }

    public void setOccurrenceCounter(int occurrenceCounter) {
        this.occurrenceCounter = occurrenceCounter;
    }


}
