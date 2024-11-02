package org.justice1k.algorithms.sorting;

public class SelectionSort {

//    Regular selection sort
    
    public void sort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[i]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

//    Selection sort variations


}
