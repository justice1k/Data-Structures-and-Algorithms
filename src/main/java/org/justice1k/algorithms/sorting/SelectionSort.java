package org.justice1k.algorithms.sorting;

public class SelectionSort {

//    Regular selection sort
    
    public void sort(int[] arr){
        int n = arr.length;

//      first loop through array from first index to last but one index. Assume index i is the index with minimum value
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;

//          loop through the array again with an inner loop but this time start from index i + 1 to the last element
            for (int j = i + 1; j < n; j++){

//              compare the current index of the inner loop(j) to the current index of the outer loop(i)
//              assign minIndex to j if the value of the current inner loop index is lesser than the value of the current outer loop index
                if (arr[j] < arr[i]){
                    minIndex = j;
                }
            }

//            finally, swap value of current outer index with value of minIndex
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    /*
    Complexity
    * Best case: O(n^2)
    * Average case: O(n^2)
    * Worst case: O(n^2)
    */

//    Selection sort variations


}
