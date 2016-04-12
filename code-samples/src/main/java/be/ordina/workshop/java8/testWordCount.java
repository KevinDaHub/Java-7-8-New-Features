package be.ordina.workshop.java8;

import org.junit.Test;

public class testWordCount {

    @Test(expected = NullPointerException.class)
    public final void wordCountValid(){
        WordCount wordCount = new WordCount();
        wordCount.wordCount(null);
    }



}
