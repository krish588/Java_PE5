package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdateList {
    private ArrayList<String> arrayList;

    public String[] updateList(String[] toUpdate, String toReplace, String newString) {
        String errorMessage = "Found Null value";
        arrayList = new ArrayList<>(Arrays.asList(toUpdate));
        int indexOfStirngToReplace = arrayList.indexOf(toReplace);
        if (indexOfStirngToReplace != -1 ) {

            arrayList.set(indexOfStirngToReplace, newString);

            String[] updatedArray = arrayList.toArray(new String[toUpdate.length]);

            arrayList.clear();

            return updatedArray;
        }
        return toUpdate;
    }

    public List<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

}
