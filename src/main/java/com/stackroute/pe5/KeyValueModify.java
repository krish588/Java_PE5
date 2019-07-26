package com.stackroute.pe5;

import java.util.HashMap;

public class KeyValueModify{


    public  HashMap<String,String> isKeyValue() {

        // Create a Map of words and their key and values
        HashMap<String,String> mapValues = new HashMap<String, String>()
        {
            {
                put("1", "java");
                put("2", "c++");
            }

        };

        // Print the map
        System.out.println(mapValues);

        // Updating value in HashMap using put()


        // Update the value of key "val2" to "java"
        mapValues.put("2", "java");
        // replacing the value of key "val1" with " "
        mapValues.replace("1"," ");
        System.out.println(mapValues);

        return mapValues;
    }
}

