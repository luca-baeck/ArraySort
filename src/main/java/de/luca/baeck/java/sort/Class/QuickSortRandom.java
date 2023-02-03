package de.luca.baeck.java.sort.Class;

import java.util.Random;

import de.luca.baeck.java.sort.AbstractClass.AbstractQuickSort;

public class QuickSortRandom<E extends Comparable<E>> extends AbstractQuickSort<E> {

    @Override
    public int getPivot(E[] array, int left_border, int right_border) {
        int index = left_border + (new Random()).nextInt(right_border-left_border);
        return index;
    }

}
