package com.aiello.exercise.arrays;

/**
 * Created by francisaiello on 12/6/15.
 */
public class OrderedArray {
    private long[] array;
    private int nElems;     // number of data items

    public OrderedArray(int max) {
        array = new long[max];
        nElems=0;
    }

    public int size() {
        return nElems;
    }



    /**
     * Method uses a binary search algorithm to find the value in array
     * @param searchKey
     * @return
     */
    public int find(long searchKey) {
        int lowerBound=0;
        int upperBound=nElems - 1;
        int currentIndex;

        while(true) {
            currentIndex = (lowerBound + upperBound) / 2;
            // Check if the index is pointing to the correct item
            if (array[currentIndex]==searchKey)
                return currentIndex; // Return index of where item is located
            else if(lowerBound > upperBound)
                return nElems; // Return the number of elements
            else {
                // Determine if value we are searching for is greater than current value
                if (array[currentIndex] < searchKey)
                    lowerBound = currentIndex + 1;
                else
                    upperBound = currentIndex - 1; // it's in lower half
            } // end else divide range
        } // end while loop
    } // end find()

    public void insert(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (array[j] > value)        // (linear search)
                break;
        }

        for (int k = nElems; k > j; k--)
            array[k] = array[k - 1];
        array[j] = value;               // insert it
        nElems++;
    } // end insert()

    public boolean delete(long value) {
        int j = find(value);
        if(j==nElems) // can’t find it
            return false;
        else {
            for(int k=j; k<nElems; k++) // move bigger ones down
                array[k] = array[k+1];
                nElems--; // decrement size
                return true;
        }
    } // end delete()

    public void display() {
        for (int i=0; i<nElems; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
