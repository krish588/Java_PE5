package com.stackroute.pe5;

import java.security.InvalidParameterException;
import java.util.*;

public class CountNumber {
    private String inputString;

    public boolean setString(String inputString){
        boolean state = false;
        if (inputString == null){
            throw new NullPointerException();
        }
        else if (inputString.isEmpty()){
            throw new RuntimeException("You have entered an empty array.");
        }
        else {
            this.inputString = inputString;
            state = true;
        }
        return state;
    }


    public void setString(int inputString) {
        throw new InvalidParameterException();
    }



    public Map<String, Integer> getOccurrenceMap() {
        Map<String, Integer> countMap = new TreeMap<>();
        String[] strings = this.inputString.trim().split("\\W|_| ");
        List<String> stringList = Arrays.asList(strings);
        for (String word:strings){
            if (!word.isEmpty()){
                if (!countMap.containsKey(word)){
                    countMap.put(word, Collections.frequency(stringList, word));
                }
            }
        }
        return countMap;
    }

}
