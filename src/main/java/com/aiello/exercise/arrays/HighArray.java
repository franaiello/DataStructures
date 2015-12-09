package com.aiello.exercise.arrays;

/**
 * Created by francisaiello on 12/6/15.
 */
public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j=0;
        boolean foundItem=false;

        for (j=0; j<nElems; j++) {
            if (a[j] == searchKey) {
                foundItem = true;  // no, found it
                break;
            }
        }

        return foundItem;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j=0;
        for (j = 0; j < nElems; j++)
            if (value == a[j]) break;
        if (j == nElems) return false;
        else {
            for (int k = j; k < nElems; k++) // move higher ones down
                a[k] = a[k + 1];
            nElems--; // decrement size
            return true;
        }
    }

    public void display() {
        for (int j=0; j<nElems; j++) {
            System.out.print(a[j] + " ");
            //System.out.println("");
        }
    }
}
