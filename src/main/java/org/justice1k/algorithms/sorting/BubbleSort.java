package org.justice1k.algorithms.sorting;

public class BubbleSort {

//    Regular bubble sort

    public void sort(int[] arr){
        int n = arr.length;
//        first loop the array from first to last index
        for (int i = 0; i < n - 1; i++){
//            loop through the array again with an inner loop from index i + 1 to the last index
            for (int j = i + 1; j< n; j++){
//                check if the current index of the outer loop is larger than the current index of the inner loop
                if (arr[i] > arr[j]){
//                    swap them if true
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

//    Recursive bubble sort

    public void recursive( int[] arr){
        int n = arr.length;
        recursiveSort(arr, n);
    }

    private void recursiveSort(int[] arr, int n){
        if(n == 1) return;
        for(int j = 0; j < n - 1; j++){
            if(arr[j] > arr[j + 1]){
                int temp = arr[j];
                arr[j] = arr[j +1];
                arr[j +1] = temp;
            }
        }

        recursiveSort(arr, n-1);
    }

}
