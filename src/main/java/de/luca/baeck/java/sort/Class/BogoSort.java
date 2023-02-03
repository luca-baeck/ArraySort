package de.luca.baeck.java.sort.Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import de.luca.baeck.java.sort.AbstractClass.AbstractSort;

public class BogoSort<E extends Comparable<E>> extends AbstractSort<E>{

    @Override
    public E[] execute(E[] array) {
        boolean sorted = false;
        while(sorted == false) {
            sorted = true;
            //random array shuffle
            //new indices
            List<Integer> indices = new ArrayList<>();
            while(indices.size() != array.length) {
                int newIndex = (new Random()).nextInt(array.length);
                if(!indices.contains(newIndex)) {
                    indices.add(newIndex);
                }
            }
            for(int i = 0; i < indices.size(); i++) {
                array = swap(array, i, indices.get(i));
            }

            //checking if array is sorted
            for(int i = 1; i < array.length; i++) {
                if(array[i].compareTo(array[i-1]) < 0) {
                    sorted = false;
                    break;
                }
            }
        }
        return array;
    }
    
}
