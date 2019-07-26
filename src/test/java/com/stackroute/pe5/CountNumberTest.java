package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class CountNumberTest {

    private CountNumber countNumber;


    @Before
    public void setUp() {
        countNumber = new CountNumber();
    }


    @After
    public void tearDown() {
        countNumber = null;
    }


    @Test(expected = NullPointerException.class)
    public void givenNullValueShouldReturnNullPointerException() {
        countNumber.setString(null);
    }


    @Test(expected = RuntimeException.class)
    public void givenEmptyStringShouldReturnRuntimeException() {
        countNumber.setString("");
    }



    @Test(expected = InvalidParameterException.class)
    public void givenIntShouldReturnInvalidParameterException() {
        countNumber.setString(25);
    }



    @Test
    public void givenStringShouldReturnTheMap() {
        assertTrue(countNumber.setString("eight eight -eight___nine,,ten,eight @ten*eight?nine"));
        Map<String, Integer> expectedOutput = new TreeMap<>();
        expectedOutput.put("eight", 5);
        expectedOutput.put("nine", 2);
        expectedOutput.put("ten", 2);
        assertEquals(expectedOutput, countNumber.getOccurrenceMap());
    }


    @Test
    public void givenStringShouldNotReturnTheExpectedOutput() {
        assertTrue(countNumber.setString("eight eight -eight___nine,,ten,eight @ten*eight?nine"));
        Map<String, Integer> expectedOutput = new TreeMap<>();
        expectedOutput.put("eight", 5);
        expectedOutput.put("nine", 1);
        expectedOutput.put("ten", 2);
        assertNotEquals(expectedOutput, countNumber.getOccurrenceMap());
    }

}