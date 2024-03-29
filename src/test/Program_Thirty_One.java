package test;

public class Program_Thirty_One {

    public static int longestPeak(int[] array) {
        int longestPeak = 0;
        int i =1;
        while (i < array.length-1){

            boolean isPeak = array[i-1] < array[i] && array[i] > array[i+1];
            if(!isPeak){
                i++;
                continue;
            }

            int left = i-2;
            while (left >=0 && array[left] < array[left+1]){
                left--;
            }
            int right = i+2;
            while (right<array.length && array[right]> array[right-1])
            {
                right++;
            }

            int peakSize = right -(left+1);
            if(peakSize > longestPeak){
                longestPeak = peakSize;
            }
            i = right;
        }
        return longestPeak;
    }
}
