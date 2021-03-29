package test;


import java.util.*;

public class Program_fifteen {
    public static int binarySearch(int[] array, int target) {
        int i = -1;
        i = binarySearchHelper(0, array.length, array, target);
        return i;
    }


    public static int binarySearchHelper(int start, int end, int[] array, int target) {
        int pos =-1;
        if (end >= start) {
            int middle = (start + end) / 2;

            if (target == array[middle]) {
                return middle;

            }

            if (target > array[middle]) {
               return binarySearchHelper(middle + 1, end, array, target);
            }

               return binarySearchHelper(start, middle-1, array, target);

        }else {
            return pos;

        }

    }


    static   int binarySearchh(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearchh(arr, l, mid - 1, x);
            return binarySearchh(arr, mid + 1, r, x);
        }
        return -1;
    }
}

