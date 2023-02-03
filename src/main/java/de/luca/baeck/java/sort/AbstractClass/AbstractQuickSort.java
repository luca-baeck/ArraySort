package de.luca.baeck.java.sort.AbstractClass;

import de.luca.baeck.java.sort.Interface.QuickSort;

public abstract class AbstractQuickSort<E extends Comparable<E>> extends AbstractSort<E> implements QuickSort<E> {

    @Override
    public E[] execute(E[] array) {
        return quickSort(array, 0, array.length-1);
    }

    private E[] quickSort(E[] array, int left_index, int right_index) {
        if (left_index < right_index) {
            int pivotIndex = preSort(array, left_index, right_index);
    
            array = quickSort(array, left_index, pivotIndex-1);
            array = quickSort(array, pivotIndex+1, right_index);

            return array;
        }
        return array;
    }

    private int preSort(E[] array, int begin, int end) {
        int indexPivot = getPivot(array, begin, end);
        E pivot = array[indexPivot];
        array = swap(array, indexPivot, end);
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                array = swap(array, i, j);
            }
        }
        array = swap(array, i+1, end);
        return i+1;
        }
    
}
