package com.aiello.exercise.sorting;

/**
 * Created by francisaiello on 12/7/15.
 */
public class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        BubbleSort array;                       // reference to array
        array = new BubbleSort(maxSize);

        array.insert(77);
        array.insert(99);
        array.insert(44);
        array.insert(55);
        array.insert(22);
        array.insert(88);
        array.insert(11);
        array.insert(00);
        array.insert(66);
        array.insert(33);

        // Before sorting
        array.display();

        array.sort();                           // sort the array

        // After sorting
        array.display();
    }
}
