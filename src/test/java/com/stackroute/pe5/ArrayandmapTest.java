package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ArrayandmapTest {
    //object declared for java class

    private static Arrayandmap bool;
    @Before
    public void setup(){
        bool=new Arrayandmap();
    }
    @After
    public void tearDown(){
        bool=null;
    }

    @Test
    public void element()
    {
        String[] str={"a","b","c","d","a","c","c"};
        //calling method declared in java class
        Map<String,Boolean> result=bool.isCountOfElement(str);
        Map<String,Boolean> original=new HashMap<>();
        original.put("a",true);
        original.put("b",false);
        original.put("c",true);
        original.put("d",false);
        assertEquals(original,result);

    }

}