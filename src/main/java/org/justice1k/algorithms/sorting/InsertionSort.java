package org.justice1k.algorithms.sorting;

public class InsertionSort {

//    Regular Insertion Sort

//    TODO: Comment
    public void sort(int[] arr){
        for (int i = 1; i <= arr.length -1; i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j -1];
                arr[j -1] = arr[j];
                arr[j] = temp;

                j--;

            }
        }
    }


}
