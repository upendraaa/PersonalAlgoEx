package test;

import java.util.*;

public class Program_two {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int jPos = 0;
        int count =0;
        for(int i =count; i< sequence.size();i++){
            for( int j= jPos; j< array.size();j++){
                if(sequence.get(i) == array.get(j) )
                {
                    count++;
                    jPos = j+1;
                    if(count == sequence.size()){
                        return true;
                    }
                    break;
                }
                if(j== (array.size()-1)){
                    jPos = 0;
                    count =0;
                }

            }

        }
        return false;
    }
}

