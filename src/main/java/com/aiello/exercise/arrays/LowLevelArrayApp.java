package com.aiello.exercise.arrays;


public class LowLevelArrayApp {
    public static void main(String[] args) {
        // Create intial size of 100 elements
        LowArray arr = new LowArray(100);
        int nElems = 0;
        int j;

        // Only add 10 numbers into arry
        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);

        nElems = 10;
        System.out.println("NumOfElements: " + arr.getNumOfSetElem());

        for(j=0; j<nElems; j++) {
            System.out.print(arr.getElem(j) + " ");
        }

        System.out.println("");
        int searchKey = 26; // search for data item
        for(j=0; j<nElems; j++) {
            if (arr.getElem(j) == searchKey) // found item?
                break;
        }

        if(j == nElems)
            System.out.println("Can't find: " + searchKey);
        else
            System.out.println("Found" + searchKey);

        // delete value 55
        for(j=0; j<nElems; j++)
            if(arr.getElem(j) == 55)
                break;
        for(int k=j; k<nElems; k++) // higher ones down
            arr.setElem(k, arr.getElem(k+1) );
        nElems--; // decrement size
        for(j=0; j<nElems; j++) // display items
            System.out.print( arr.getElem(j) + " ");
            System.out.println("");
    }
}
