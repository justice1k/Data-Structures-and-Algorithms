package org.justice1k.algorithms.sorting;

public class InsertionSort {

//    Regular Insertion Sort

//    TODO: Comment
    public void sort(int[] arr){
//        first loop through the array starting from the second element to the last element
        for (int i = 1; i <= arr.length -1; i++){
            int j = i;
//            check if the element of the current index i is lesser than the element before it(left side/ i - 1)
            while(j > 0 && arr[j - 1] > arr[j]){
//                if true keep swaping till no element on the left side is greater than the current element
                int temp = arr[j -1];
                arr[j -1] = arr[j];
                arr[j] = temp;

                j--;

            }
        }
    }


}
