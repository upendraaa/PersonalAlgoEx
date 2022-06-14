package itest;


import java.util.HashMap;

public class CharInString {


    // Write a code to check if two string “MARY” and “ARMY” can be converted to each other?

    public static void main(String[] agrs) {


    }

    public boolean isStringConvertible(String input1, String input2) {

        boolean isConvertible = false;

        if (input1.length() != input2.length()) {
            return isConvertible;
        }

        if (input1.equalsIgnoreCase(input2)) {
            isConvertible = true;
            return isConvertible;
        }

        HashMap<String, Integer> map = new HashMap<>();

        char[] inputArray1 = input1.toCharArray();


        for (int i = 0; i < inputArray1.length; i++) {

            if (map.keySet().contains(inputArray1[i])) {
                map.put(String.valueOf(inputArray1[i]), map.get(inputArray1[i]) + 1);
            } else {
                map.put(String.valueOf(inputArray1[i]), 1);
            }

        }


        char[] inputArray2 = input2.toCharArray();


        for (int i = 0; i < inputArray2.length; i++) {

            if (map.keySet().contains(inputArray2[i])) {
                if (map.get(inputArray2[i]) > 1) {
                    map.put(String.valueOf(inputArray2[i]), map.get(inputArray2[i]) - 1);
                } else {
                    map.remove(inputArray2[i]);
                }
            } else {
                return false;
            }

        }


        return isConvertible;
    }


    //Class level syncronization
    public synchronized int addNumber(int a, int b) {

        return a + b;
    }

}

