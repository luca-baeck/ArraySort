package de.luca.baeck.java.sort;

import java.util.Random;

import de.luca.baeck.java.sort.Interface.Sort;

import de.luca.baeck.java.sort.Class.BogoSort;
import de.luca.baeck.java.sort.Class.BubbleSortCheck;
import de.luca.baeck.java.sort.Class.BubbleSortSimple;
import de.luca.baeck.java.sort.Class.InsertionSort;
import de.luca.baeck.java.sort.Class.MergeSort;
import de.luca.baeck.java.sort.Class.QuickSortLeft;
import de.luca.baeck.java.sort.Class.QuickSortMedian;
import de.luca.baeck.java.sort.Class.QuickSortRandom;
import de.luca.baeck.java.sort.Class.QuickSortRight;
import de.luca.baeck.java.sort.Class.SelectionSort;
import de.luca.baeck.java.sort.Class.ShellSort;

public class AppTest {

    public static void main(String[] args) {
        Sort<Integer> sort = new ShellSort<Integer>();

        Integer[] arrayI = new Integer[15];

        for(int i = 0; i < arrayI.length; i++) {
            arrayI[i] = (new Random()).nextInt(50);
        }

        Integer[] sortedArray = sort.execute(arrayI);

        for(int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }

    }
}

