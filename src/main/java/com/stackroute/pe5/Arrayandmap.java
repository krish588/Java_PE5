package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arrayandmap{

    //function called and returns boolean type

    public boolean countString(String str,String key)
    {
        Pattern pattern=Pattern.compile(key);
        Matcher matcher=pattern.matcher(str);

        int counter=0;
        while (matcher.find())
        {
            counter++;
        }

        if(counter>=2) {
            return true;
        }
        else{
            return false;
        }

    }
    //Method declared
    public Map<String,Boolean> isCountOfElement(String[] str){
        Map<String, Boolean> map = new HashMap<String, Boolean>();

        String[] keys={"a","b","c","d"};
        String temp="";
        for(int i=0;i<str.length;i++)
        {
             temp+=str[i]+" ";
        }
        for(int i=0;i<keys.length;i++)
        {
            map.put(keys[i],countString(temp,keys[i]));
        }

        return map;
    }
}
