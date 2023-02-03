package de.luca.baeck.java.sort.Class;

import de.luca.baeck.java.sort.AbstractClass.AbstractQuickSort;

public class QuickSortLeft<E extends Comparable<E>> extends AbstractQuickSort<E> {

    @Override
    public int getPivot(E[] array, int left_border, int right_border) {
        return left_border;
    }

}