package com.lambdaschool;

import java.util.ArrayList;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> wordsArrayList = new ArrayList<String>();
        HashMap<Integer, String> wordsHashMap = new HashMap<Integer, String>();
        int hashCount = 0;
        for (String word : wordsArrayList)
        {
            wordsHashMap.put(hashCount, word);
            hashCount++;
        }
        System.out.println("\nStill works.\n");
    }
}