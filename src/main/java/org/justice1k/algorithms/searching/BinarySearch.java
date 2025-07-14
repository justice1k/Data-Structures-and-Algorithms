package org.justice1k.algorithms.searching;

public class BinarySearch {
    public boolean search(int[] arr, int low, int high, int n){

        do {
            int mid =(int) Math.floor(low + (high - low) / 2);
            int val = arr[mid];
            if(val == n){
                return true;
            } else if (val > n) {
                high = mid;
            } else{
                low = mid + 1;
            }
        }while(low < high);

        return false;
    }
}
