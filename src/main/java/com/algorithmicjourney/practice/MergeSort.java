package com.algorithmicjourney.practice;

public class MergeSort {

    public static void main(String[] args) {
        int[] res = mergeSort(new int[]{5, 3, 2, 1, 4}, 0, 4);
        for (int ele : res) {
            System.out.println(ele);
        }
    }

    public static int[] mergeSort(int[] arr, int l, int r) {

        if (l < r) {

            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
        return arr;
    }

    public static void merge(int[] arr, int l, int m, int r) {

        // Find lengths of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy the sorted left & right halfs to temp arrays
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = arr[m + 1 + j];
        }

        // initial indexes of left and right sub-arrays
        int i = 0, j = 0;
        int k = l;

        // Merge the two sorted halfs into the original array
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }        // One of the halfs will have elements remaining


        // Copy remaining elements of left[] if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right[] if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }

}
