package test;

import java.lang.reflect.Array;
import java.util.*;

public class Program_fourteen {
    // Tip: You can use `element instanceof ArrayList` to check whether an item
    // is an array or an integer.
    public static int productSum(List<Object> array) {
        // Write your code here.

        return getProduct(array,1);
    }


    public static int getProduct(List<Object> array, int mutliply) {
        int sum =0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) instanceof ArrayList) {
                List<Object> tempList = (List<Object>) array.get(i);
                sum = sum+ getProduct(tempList, mutliply+1);
            } else {
                sum = sum + (int) array.get(i);

            }
        }

       return sum*mutliply;
    }
}
