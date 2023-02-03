package de.luca.baeck.java.sort.Class;

import de.luca.baeck.java.sort.AbstractClass.AbstractSort;

public class BubbleSortSimple<E extends Comparable<E>> extends AbstractSort<E> {

    @Override
    public E[] execute(E[] array) {
      for (int i = array.length; i > 0; i--) {
        for (int j = 0; j < i - 1; j++) {
          if (array[j].compareTo(array[j + 1]) > 0) {
            swap(array, j, j + 1);
          }
        }
      }
      return array;
    }
    
}
