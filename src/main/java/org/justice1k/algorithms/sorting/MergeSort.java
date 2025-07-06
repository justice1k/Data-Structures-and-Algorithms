package org.justice1k.algorithms.sorting;

import java.util.ArrayList;

public class MergeSort {

    public void sort(int[] arr, int low, int high){
//        base case
        if(low >= high) return;

//       divide array into two
        int mid = (low + high)/ 2;

//        sorting left part
        sort(arr, low, mid);
//        sorting right part
        sort(arr, mid+1, high);

//        merge the two arrays
        merge(arr, low,mid,high);
    }

    public void merge(int[] arr, int low, int mid, int high){
//        temp array to store sorted elements
        ArrayList<Integer> temp = new ArrayList<>();
//        pointer to the first element of the left array
        int left = low;
//        pointer to the first element of the right array
        int right = mid + 1;


//      loop while there are elements in BOTH arrays
        while(left <= mid && right <= high){
//          check if current element of left array is lesser or equal to current element of right array
            if(arr[left] <= arr[right]){
//              if true add the element to the temp array
                temp.add(arr[left]);
//              increase the left pointer
                left++;
            }else {
//              if current element of the left array is bigger than that of the right array
//              add the current element of the right array to the temp array
                temp.add(arr[right]);
//              increase the right pointer
                right++;
            }

        }
//      while there are still elements in the left array
//      add them to the temp array and increase the left pointer
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

//      while there are still elements in the right array
//      add the to the temp array and increase the left pointer
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

//      now loop through the array from the LOW index to the HIGH
        for(int i = low; i <= high; i++){
//          fill the original array with elements from the temp array starting from current index - LOW index
            arr[i] = temp.get(i - low);
        }
    }
}
