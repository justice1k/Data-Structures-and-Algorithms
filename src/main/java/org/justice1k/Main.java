package org.justice1k;
import org.justice1k.algorithms.sorting.BubbleSort;
import org.justice1k.algorithms.sorting.InsertionSort;
import org.justice1k.algorithms.sorting.SelectionSort;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2,3,4,3,7,4,5,5,6,6,9,3};

        InsertionSort insertionSort = new InsertionSort();

        insertionSort.sort(arr);

        for (int i : arr){
            System.out.print(i);
        }



    }
}