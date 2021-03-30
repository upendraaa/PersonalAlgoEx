package test;

import java.util.*;

public class Program_sixteen {
    public static int[] findThreeLargestNumbers(int[] array) {

        int[] returnArray = {Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};


        for(int i: array){

            if(i > returnArray[2]){

                if(returnArray[2] == Integer.MIN_VALUE)
                {
                    returnArray[2] = i;
                    continue;
                }
                returnArray[0] = returnArray[1];
                returnArray[1] = returnArray[2];
                returnArray[2] = i;
            }else if(i> returnArray[1]){

                if(returnArray[1] == Integer.MIN_VALUE)
                {
                    returnArray[1] = i;
                    continue;
                }

                returnArray[0] = returnArray[1];
                returnArray[1] = i;
            }else if(i> returnArray[0]){
                returnArray[0] =i;
            }

        }

        return returnArray;
    }
}
