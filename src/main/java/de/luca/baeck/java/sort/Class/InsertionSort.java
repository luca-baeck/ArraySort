package de.luca.baeck.java.sort.Class;

import de.luca.baeck.java.sort.AbstractClass.AbstractSort;

public class InsertionSort<E extends Comparable<E>> extends AbstractSort<E> {

    @Override
    public E[] execute(E[] array) {
      for(int i = 1; i < array.length; i++) {
        int j = i;
        E x = array[i];
        while(j > 0 && array[j-1].compareTo(x) > 0) {
            array[j] = array[j-1];
            j = j-1;
        }
        array[j] = x;
      }
      return array;
    }
    
}
