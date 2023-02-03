package de.luca.baeck.java.sort.Class;

import java.util.ArrayList;
import java.util.List;

import de.luca.baeck.java.sort.AbstractClass.AbstractSort;

public class MergeSort<E extends Comparable<E>> extends AbstractSort<E>{

    @Override
    public E[] execute(E[] array) {
        if(array.length > 1) {
            List<E> arrayList = new ArrayList<>();
            for(int i = 0; i < array.length; i++) {
                arrayList.add(array[i]);
            }
            List<E> sortedList = this.execute(arrayList);
            for(int i = 0; i < sortedList.size(); i++) {
                array[i] = sortedList.get(i);
            }
        }
        return array;
    }

    private List<E> execute(List<E> array) {
        if(array.size() > 1) {
            int divideIndex = (int)((array.size()-1)/2);
            List<E> a1 = new ArrayList<>();
            for(int i = 0; i <= divideIndex; i++) {
                a1.add(array.get(i));
            }

            List<E> a2 = new ArrayList<>();
            for(int i = divideIndex+1; i < array.size(); i++) {
                a2.add(array.get(i));
            }

            a1 = this.execute(a1);
            a2 = this.execute(a2);

            //merging
            int indexA1 = 0;
            int indexA2 = 0;

            array.clear();

            while(indexA1 < a1.size() && indexA2 < a2.size()) {
                if(a1.get(indexA1).compareTo(a2.get(indexA2)) < 0){
                    array.add(a1.get(indexA1));
                    indexA1++;
                }else {
                    array.add(a2.get(indexA2));
                    indexA2++;
                }
            }
            while(indexA1 < a1.size()) {
                array.add(a1.get(indexA1));
                indexA1++;
            }
            while(indexA2 < a2.size()) {
                array.add(a2.get(indexA2));
                indexA2++;
            }
        }
        return array;
    }
    
}
