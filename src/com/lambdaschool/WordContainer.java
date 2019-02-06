package com.lambdaschool;

import java.util.Comparator;

public class WordContainer
{
    private String word;
    private int count;

    public WordContainer()
    {
        word = "";
        count = 0;
    }

    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

}

class SortbyCount implements Comparator<WordContainer>
{
    public int compare(WordContainer a, WordContainer b)
    {
        return b.getCount() - a.getCount();
    }
}
