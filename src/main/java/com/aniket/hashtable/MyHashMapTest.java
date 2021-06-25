package com.aniket.hashtable;

import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {

    /*Finding frequency of words in a large paragraph phrase*/
    @Test
    public void giveASentence_whenWordsAreAddedToList_ShouldReturnWordFrequency() {
        String sentence = "Paranoids are not paranoid because they are paranoid "+
                "but because they keep putting themselves "+
                "deliberately into paranoid avoidable situations";
        MyHashMap<String, Integer> myLinkedHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words) {
            Integer value = myLinkedHashMap.get(word);
            if(value == null)
                value = 1;
            else
                value = value + 1;
            myLinkedHashMap.add(word, value);
        }
        System.out.println(myLinkedHashMap);
        int frequency = myLinkedHashMap.get("paranoid");
        Assert.assertEquals(3, frequency);
    }

}
