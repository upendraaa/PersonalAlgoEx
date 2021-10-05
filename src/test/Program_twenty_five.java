package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_twenty_five {

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

        Arrays.sort(array);
        ArrayList<Integer[]> list = new ArrayList<>();
        int second =0;
        int third =0;
        int sum =0;
         for (int i=0;i< array.length-2;i++)
         {
             second = i+1;
             third = array.length-1;
             while (third>second){
                 sum = array[i]+array[second]+array[third];
                 if(sum == targetSum){
                     list.add(new Integer[]{array[i],array[second],array[third]});
                     third--;
                 }else if(sum > targetSum){
                     third--;
                 }else{
                     second++;
                 }
             }
         }
        return list;
    }
}
