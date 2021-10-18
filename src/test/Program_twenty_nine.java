package test;

import java.util.*;

class Program_twenty_nine {
    public static boolean isMonotonic(int[] array) {
        boolean isMonotonic = true;
        if(array.length <=1){
             return  isMonotonic;
        }

        boolean isIncreasing = false;
        boolean isDecreasing = false;

        for(int i =1; i< array.length ; i++){

            if(array[i] > array[i-1]){
                isIncreasing = true;
            }

            if(array[i] < array[i-1]){
                isDecreasing = true;
            }

            if(isIncreasing && isDecreasing){
                isMonotonic = false;
                break;
            }


        }

        return isMonotonic;
    }
}
