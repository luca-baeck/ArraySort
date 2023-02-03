package de.luca.baeck.java.sort.Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import de.luca.baeck.java.sort.AbstractClass.AbstractQuickSort;

public class QuickSortMedian<E extends Comparable<E>> extends AbstractQuickSort<E> {

    @Override
    public int getPivot(E[] array, int left_border, int right_border) {
        if((right_border-left_border) < 3) {
            return left_border + (new Random()).nextInt(right_border-left_border);
        }
        List<Integer> index = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            int newIndex = left_border + (new Random()).nextInt(right_border-left_border);
            while(index.contains(newIndex)) {
                newIndex = left_border + (new Random()).nextInt(right_border-left_border);
            }
            index.add(newIndex);
        }
        
        int indexLowest = 0;
        for(int i = 0; i < index.size(); i++) {
            if(array[i].compareTo(array[indexLowest]) > 0) {
                indexLowest = i;
            }
        }
        index.remove(index.get(indexLowest));

        int indexMedian = 0;
        for(int i = 0; i < index.size(); i++) {
            if(array[i].compareTo(array[indexMedian]) > 0) {
                indexMedian = i;
            }
        }
        return indexMedian;
    }
    
}
