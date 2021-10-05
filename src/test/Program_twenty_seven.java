package test;

import java.util.*;

import static java.lang.Math.abs;

public class Program_twenty_seven {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] returnArray = {arrayOne[0],arrayTwo[0]};
        for(int i =0;i< arrayOne.length;i++){
            for(int j=0;j<arrayTwo.length;j++){
                if(abs(arrayOne[i]-arrayTwo[j]) < abs(returnArray[0] - returnArray[1])){
                    returnArray[0]= arrayOne[i];
                    returnArray[1] = arrayTwo[j];
                }
            }
        }
        // Write your code here.
        return returnArray;
    }
}
