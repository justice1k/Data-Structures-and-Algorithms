package org.justice1k;
import org.justice1k.algorithms.sorting.BubbleSort;
import org.justice1k.algorithms.sorting.MergeSort;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2,3,4,3,7,4,5,5,6,6,9,3};

        int high = arr.length - 1;

        MergeSort mS = new MergeSort();
        mS.sort(arr, 0, high);



        for (int i : arr){
            System.out.print(i);
        }

    }
}