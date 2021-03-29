package test;

import java.util.*;

public class Program_ten {

    public static int minimumWaitingTime(int[] queries) {

        Arrays.sort(queries);
        int sum =0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i< queries.length;i++){
           sum = sum + queries[i-1];
           list.add(sum);
        }
        sum =0;
        for( Integer i : list){
            sum = sum +i;

        }

        return sum;
    }
}

