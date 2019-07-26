package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import static org.junit.Assert.*;

public class KeyValueModifyTest {

    //Object declaration
    KeyValueModify ob;


    @Before
    public void setup() {
        ob = new KeyValueModify();
    }

    @After
    public void tearDown() {
        ob = null;
    }


    @Test
    //method declaration
    public void keyValues() {
        ob = new KeyValueModify();
        HashMap<String, String> map = new HashMap<String, String>() { //Expected Hash Map
            {
                put("1", " ");
                put("2", "java");
            }
        };

        //calling method present in java class

        HashMap<String, String> result = ob.isKeyValue();

        assertEquals(map,result);


    }

}