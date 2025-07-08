package org.justice1k.algorithms.sorting;

public class QuickSort {

    public void sort(int[] arr, int low, int high){
//      checks if array has more that one element then proceeds to sort recursively
        if(low < high){
            int partIndex = partition(arr, low, high);
            sort(arr, low, partIndex - 1);
            sort(arr, partIndex + 1, high);
        }

    }

    private int partition(int[] arr, int low, int high){
//      stores the value of current pivot
        int pivot = arr[low];
//      left pointer
        int left = low;
//      right pointer
        int right = high;

        while(left < right){
//          increments left pointer while the value of the element at its index is less or equal to the pivot
            while(arr[left] <= pivot && left <= high -1){
                left++;
            }

//          decreases right pointer while the value of the element at its index is greater than the pivot
            while(arr[right] > pivot && right >= low +1){
                right--;
            }

//          while left pointer is less than right AND either the value of arr[left] is greater than the pivot
//          or the value of arr[right] if lesser than the pivot
//          they are swapped
            if( left < right){
                swap(arr, right, left);
            }
        }

//      after left and right pointer crosses
//      the pivot i.e index low is swapped into its correct position, index right
        swap(arr,low,right);

//      index right is returned to be used as a pivot point for further partitioning
        return right;
    }

    private void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
