package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class UpdateListTest {

    UpdateList updateList;

    @Before
    public void setUp() throws Exception {
        updateList = new UpdateList();
    }

    @After
    public void tearDown() throws Exception {
        updateList = null;
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void givenNullAsArrayShouldThrowNullPointerExceptionWithMessage() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Null or empty value given");
        updateList.updateList(null, "string to replace", "new string");
    }

    @Test
    public void givenNullAsStringToReplaceShouldThrowNullPointerExceptionWithMessage() {
        expectedException.expect(NullPointerException.class);
        updateList.updateList(new String[]{"apple", "Orange"}, null, "new string");
    }

    @Test
    public void givenNullAsNewStringShouldThrowNullPointerExceptionWithMessage() {
        expectedException.expect(NullPointerException.class);
        updateList.updateList(new String[]{"apple", "Orange"}, "String to replace", null);
    }

    @Test
    public void givenEmptyArrayShouldThrowNullPointerExceptionWithMessage() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Null or empty value given");
        updateList.updateList(new String[0], "string to replace", "new string");
    }

    @Test
    public void givenBlankStringToReplaceShouldThrowNullPointerExceptionWithMessage() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Null or empty value given");
        updateList.updateList(new String[]{"apple", "Orange"}, "  ", "new string");
    }

    @Test
    public void givenBlankNewStringShouldThrowNullPointerExceptionWithMessage() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Null or empty value given");
        updateList.updateList(new String[]{"apple", "Orange"}, "String to replace", "  ");
    }

    @Test
    public void givenInputShouldReturnArrayWithReplacedString() {
        String[] inputArray = {"Apple", "Grape", "Melon", "Berry"};
        String[] expectedResult = {"Kiwi", "Grape", "Melon", "Berry"};
        assertArrayEquals("givenInputShouldReturnArrayWithReplacedString: updateList() should return array with updated string element.",
                expectedResult, updateList.updateList(inputArray, "Apple", "Kiwi"));
    }


    @Test
    public void givenInputAndStringToUpdateShouldReturnSameArray() {
        String[] inputArray = {"Apple", "Grape", "Melon", "Berry"};
        assertArrayEquals("givenInputShouldReturnArrayWithReplacedString: updateList() should return array with updated string element.",
                inputArray, updateList.updateList(inputArray, "apple", "KIwI"));

    }


    @Test
    public void givenInputShouldReturnEmptiedArrayList() {
        String[] inputArray = {"Apple", "Grape", "Melon", "Berry"};
        updateList.updateList(inputArray, "Apple", "Kiwi");
        assertTrue(updateList.getArrayList().isEmpty());
    }


}