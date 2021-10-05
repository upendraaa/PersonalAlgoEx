package test;

import java.util.*;

public class Program_twenty_eight {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        for (int i =0 ;i< array.size();i++){
            if(array.get(i) == toMove){
                for(int j = array.size()-1;j >i;j--){
                    if(array.get(j) == toMove){
                        continue;
                    }else{
                        array.set(i, array.get(j));
                        array.set(j,toMove);
                        break;
                    }
                }
            }
        }
        return array;
    }
}
