package de.luca.baeck.java.sort.Interface;

public interface QuickSort<E extends Comparable<E>> extends Sort<E> {
    
    public int getPivot(E[] array, int left_border, int right_border);

}
