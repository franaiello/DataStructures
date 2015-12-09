package com.aiello.exercise.sorting;


public class BubbleSort {
    private long[] array;       // ref to array array
    private int nElems;     // number of data items

    public BubbleSort(int max) {
        array = new long[max];  // define how many elements in array
        nElems = 0;         // counter of number of items in array
    }

    public void insert(long value) {
        array[nElems] = value;
        nElems++;
    }

    public void display() {
        for(int j=0; j<nElems; j++) // for each element,
            System.out.print(array[j] + " "); // display it
        System.out.println("");
    }

    public void sort() {
        int out, in;
        for(out=nElems-1; out>1; out--)         // outer loop (backward)
            for(in=0; in<out; in++)             // inner loop (forward)
                if( array[in] > array[in+1] )   // out of order?
                    swap(in, in+1);             // swap them
    }

    private void swap(int one, int two) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
