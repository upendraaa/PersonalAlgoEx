package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_twenty_three {


    public static boolean generateDocument(String characters, String document) {
        // Write your code here
        boolean returnValue = true;

       StringBuilder sb = new StringBuilder("");

        for(int i =0;i< document.toCharArray().length;i++){
            if(!sb.toString().contains(String.valueOf(document.charAt(i)))){
                sb.append(String.valueOf(document.charAt(i)));
                int count1 = getCharCount(characters.toCharArray(),document.charAt(i));
                int count2 = getCharCount(document.toCharArray(),document.charAt(i));
                if(count1!=count2){
                    return false;
                }
            }
        }

        return returnValue;
    }

    public static int getCharCount(char[] chars, char c){
        int count =0;
        int i=0;
        while (i<chars.length){
            if(chars[i] == c){
                count++;
            }
            i++;
        }
        return count;
    }
}
