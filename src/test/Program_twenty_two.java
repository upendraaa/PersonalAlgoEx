package test;

import java.util.*;

public class Program_twenty_two {
    public static String runLengthEncoding(String string) {
        StringBuilder stringBuilder = new StringBuilder("");
          for(int i =0;i< string.toCharArray().length ;i++){
              int count =1;
              while (((i+1)<string.toCharArray().length) && string.charAt(i) == string.charAt(i+1)){
                  count++;
                  if(count == 9){
                      stringBuilder.append(count+String.valueOf(string.charAt(i)));
                      count = 0;
                  }
                  i++;
              }
              stringBuilder.append(count+String.valueOf(string.charAt(i)));
          }

        return stringBuilder.toString();
    }
}

