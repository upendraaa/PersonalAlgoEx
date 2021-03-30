package test;

import java.util.*;

public class Program_twenty {
    public static boolean isPalindrome(String str) {
        for(int i =0; i< str.toCharArray().length; i++){
            if((str.toCharArray().length - (i+1)) > i){
                if(str.charAt(str.toCharArray().length -(i+1)) != str.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
