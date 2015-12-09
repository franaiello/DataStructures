package com.aiello.exercise.arrays;

// demonstrates array class with low-level interface
// to run this program: C>java LowArrayApp
public class LowArray {
    private long[] a;
    private int numOfSetElem;

    public LowArray(int size) {
        a = new long[size];
    }

    public void setElem(int index, long value) {
        a[index] = value;
        numOfSetElem++;
    }

    public long getElem(int index) {
        return a[index];
    }

    public int getNumOfSetElem() {
        return numOfSetElem;
    }
    public int getSize() {
        return a.length;
    }
}

