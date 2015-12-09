package com.aiello.exercise.arrays;

/**
 * Created by francisaiello on 12/6/15.
 */
public class ClassDataArray {
    private Person[] persons;
    private int nElems;

    public ClassDataArray(int max) {
        persons = new Person[max];
        nElems = 0;
    }

    public Person find(String name) {
        int j;
        for (j=0; j<nElems; j++) {
            if (persons[j].getLastName().equals(name))
                break;
        }

        if (j==nElems)
            return null;
        else
            return persons[j];
    }

    public void insert(String last, String first, int age) {
        persons[nElems] = new Person(last, first, age);
        nElems++;
    }

    public boolean delete(String searchName) {
        int j;
        for (j=0; j<nElems; j++) {
            if (persons[j].getLastName().equals(searchName))
                break;
        }

        if (j==nElems)
            return false;
        else {
            for (int k=j; k<nElems; k++) {
                persons[k] = persons[k+1];
            }
            nElems--;       // decrement size
            return true;
        }
    }

    public void displayAll() {
        for (int j=0; j<nElems; j++) {
            persons[j].displayPerson();
        }
    }
}
