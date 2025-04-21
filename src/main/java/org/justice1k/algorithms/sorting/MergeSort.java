package org.justice1k.algorithms.sorting;

import java.util.ArrayList;

public class MergeSort {

    public void sort(int[] arr, int low, int high){
//        base case
        if(low >= high) return;

        int mid = (low + high)/ 2;
//        left part
        sort(arr, low, mid);
//        right part
        sort(arr, mid+1, high);
        merge(arr, low,mid,high);
    }

    public void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int right = mid + 1;
        int left = low;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }

        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }

    }
}
