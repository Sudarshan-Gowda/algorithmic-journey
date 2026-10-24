package com.algorithmicjourney.practice;

public class StaticArray {

    public static void main(String[] args) {

        int[] array = {11, 12, 13, 14, 15};

        // basics(array);
        // removeEnd(array, array.length);
        // removeNthIndex(array, 2, array.length);
        // insertAtEnd(array, 16, array.length, 6);
        insertMiddle(array, 2, 99, array.length);

    }

    static void removeNthIndex(int[] arr, int i, int length) {
        for (int index = i + 1; index < length; index++) {
            arr[index - 1] = arr[index];
        }

        arr[length - 1] = 0;

        for (int ele : arr) {
            System.out.println(ele);
        }
    }

    static void insertAtEnd(int[] arr, int n, int length, int capacity) {
        if (length <= capacity) {
            arr[length - 1] = n;
        }

        for (int ele : arr) {
            System.out.println(ele);
        }
    }

    static void insertMiddle(int[] arr, int i, int n, int length) {
        for (int index = length - 1; index > i; index--) {
            arr[index] = arr[index - 1];
        }
        arr[i] = n;

        for (int ele : arr) {
            System.out.println(ele);
        }
    }

    static void basics(int[] array) {
        //traverse
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

        // enhanced for look
        for (int element : array) {
            System.out.println(element);
        }


        int iterate = 0;
        while (iterate < array.length) {
            System.out.println(array[iterate]);
            iterate++;
        }

        System.out.println("========Reverse elements =========");
        // reverse traverse
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.println(array[index]);
        }

        int reverseIndex = array.length - 1;
        while (reverseIndex >= 0) {
            System.out.println(array[reverseIndex]);
            reverseIndex--;
        }

    }

    static void removeEnd(int[] arr, int length) {
        if (length > 0) {
            arr[length - 1] = 0;
        }
        length--;

        // Print to check the elements in array post removal
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }

}
