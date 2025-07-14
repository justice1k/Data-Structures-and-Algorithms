package org.justice1k;
import org.justice1k.algorithms.searching.BinarySearch;
import org.justice1k.algorithms.sorting.BubbleSort;
import org.justice1k.algorithms.sorting.MergeSort;
import org.justice1k.algorithms.sorting.QuickSort;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int high = arr.length;


        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(arr,0,high,9)); //true



//        for (int i : arr){
//            System.out.println(i);
//        }

    }
}