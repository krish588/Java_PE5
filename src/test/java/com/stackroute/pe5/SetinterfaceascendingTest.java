package com.stackroute.pe5;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;


public class SetinterfaceascendingTest {
    //object declared for java class

    Setinterfaceascending re;

    @Before
    public void setup() {
        re = new Setinterfaceascending();
    }

    @After
    public void tearDown() {
        re = null;
    }


    @Test
    public void ascendingOrder() {
        re = new Setinterfaceascending();
        HashSet<String> animals = new HashSet<>();
        animals.add("harry");
        animals.add("olive");
        animals.add("alice");
        animals.add("bluto");
        animals.add("eugene");

        ArrayList<String> alist = new ArrayList<>();
        alist.add("alice");
        alist.add("bluto");
        alist.add("eugene");
        alist.add("harry");
        alist.add("olive");

        //calling method present in java class

        ArrayList<String> result = re.sortingSetInterface(animals);
        assertEquals(alist, result);
    }
}
