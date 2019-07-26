package com.stackroute.pe5;

import java.util.ArrayList;
        import java.util.Collections;
        import java.util.HashSet;
        import java.util.List;

public class Setinterfaceascending {
    //Method declaration
    public ArrayList<String> sortingSetInterface(HashSet<String> names) {


        //Hash set elements before sorting
        System.out.println("Hashset Elements: " + names + "\n");

        //Sorting elements
        ArrayList<String> listsname = new ArrayList<String>(names);
        Collections.sort(listsname);
        System.out.print("Sorted set : ");
        for (String name : listsname) {
            System.out.print(name + "\t");
        }
        System.out.println();
        System.out.println("Arraylist from set: " + listsname);

        return listsname;
    }
}
