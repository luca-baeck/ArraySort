package de.luca.baeck.java.sort.Class;

import de.luca.baeck.java.sort.AbstractClass.AbstractSort;

public class SelectionSort<E extends Comparable<E>> extends AbstractSort<E> {

    @Override
    public E[] execute(E[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            int m = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j].compareTo(array[m]) < 0) {
                    m = j;
                }
            }
            swap(array, i, m);
        }
        return array;
    }
}