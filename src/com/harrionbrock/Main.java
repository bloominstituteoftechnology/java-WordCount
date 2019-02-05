package com.harrionbrock;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "The Dog is outside now. Let's go out and play with the dog.";
        WordFrequency wordFrequency = new WordFrequency(input);
        wordFrequency.printAllWordCount();
    }
}
