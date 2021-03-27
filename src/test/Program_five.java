package test;

import java.util.Arrays;

public class Program_five {

    public static int getMinimumSum(int[] array){
        Arrays.sort(array);
        int min =0;
        for(int i =0; i< array.length;i++){

           if(i> min+1){
               return min+1;
           }

           min = min + i;

        }

        return min+1;
    }
}
