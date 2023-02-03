package de.luca.baeck.java.sort.AbstractClass;

import de.luca.baeck.java.sort.Interface.Sort;

public abstract class AbstractSort<E extends Comparable<E>> implements Sort<E> {

    protected E[] swap(E[] array, int i, int j){
        E iElement = array[i];
        array[i] = array[j];
        array[j] = iElement;
        return array;
    }

}
