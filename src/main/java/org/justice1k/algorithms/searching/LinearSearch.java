package org.justice1k.algorithms.searching;

public class LinearSearch {
    public boolean search(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }

        return false;
    }
}
