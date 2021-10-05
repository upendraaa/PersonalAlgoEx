package test;

import java.util.*;

public class Program_twenty_one {
    public static String caesarCypherEncryptor(String str, int key) {

        if(key >=26){
            key = key%26;
        }

        char[] chars = str.toCharArray();

        for(int i =0;i< chars.length;i++)
        {
            int pos = (int)chars[i] + key;
            if ((pos) > (96+26))
            {
                pos = 96+Math.abs(((96+26)-pos));
            }

            chars[i] = (char) pos;

        }


        return String.valueOf(chars);
    }
}

