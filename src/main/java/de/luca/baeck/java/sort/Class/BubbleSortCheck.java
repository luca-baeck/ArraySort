package de.luca.baeck.java.sort.Class;

import de.luca.baeck.java.sort.AbstractClass.AbstractSort;

public class BubbleSortCheck<E extends Comparable<E>> extends AbstractSort<E> {
    
@Override
  public E[] execute(E[] array) {
    int i = array.length;
    boolean swapped = false;

    do {
      swapped = false;

      for (int j = 0; j < i - 1; j++) {
        if (array[j].compareTo(array[j + 1]) > 0) {
          swap(array, j, j + 1);
          swapped = true;
        }
      }
      i--;
    }
    while (swapped);
    return array;
  }

}
