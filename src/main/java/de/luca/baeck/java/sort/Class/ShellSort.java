package de.luca.baeck.java.sort.Class;

import de.luca.baeck.java.sort.AbstractClass.AbstractSort;

public class ShellSort<E extends Comparable<E>> extends AbstractSort<E>{

    @Override
    public E[] execute(E[] array) {
        E t;
        boolean check;
        int[] schrittweiten = new int[] {5, 3, 1};
        for(int h : schrittweiten) {
            for(int i = h; i < array.length; i++) {
                int j = i;
                t = array[i];
                check = true;
                while(check && (array[j-h].compareTo(t) > 0) ) {
                    array[j] = array[j-h];
                    j = j - h;
                    check = (j>h);
                }
                array[j] = t;
            }
        }
        return array;
    }
    
}
