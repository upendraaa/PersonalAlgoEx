package test;

public class Program_Fifty {

    public static int kadanesAlgorithm(int[] array) {
        int currentMax = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            currentMax = Math.max(array[0], (array[0] + currentMax));
            max = Math.max(currentMax, max);
        }

        // Write your code here.
        return max;
    }
}
