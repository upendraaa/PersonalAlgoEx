package test;

import java.util.*;

public class Program_three {

    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] outputArray = new int[array.length];
        for(int i=0;i< array.length;i++){
            int num = array[i] * array[i];
            outputArray[i] = num;
            int k =i-1;
            while(k>=0 && outputArray[k]> outputArray[k+1])
            {
                int temp = outputArray[k];
                outputArray[k] = num;
                outputArray[k+1] = temp;
                k--;
            }

        }

        return outputArray;
    }
}
