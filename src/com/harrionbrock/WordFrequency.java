package com.harrionbrock;

public class WordFrequency {
    private String text;

    public WordFrequency(String text) {
        this.text = text;
        cleanText();
    }

    private void cleanText() {
        this.text = this.text.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");
//        return this.text;
    }

    public String getCleanInput() {
        return this.text;
    }
}
