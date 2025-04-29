package org.justice1k.algorithms.sorting;

public class BubbleSort {

//    Regular bubble sort

    public void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j< n; j++){
                if (arr[i] > arr[j]){
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
