package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_Thirty_four {
    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        List<int[]> mergedArray = new ArrayList<>();
        Arrays.sort(intervals,(a,b) -> {
            return Integer.compare(a[0], b[0]);
        });
        int[] currentInterval = intervals[0];
        mergedArray.add(currentInterval);

        for(int[] nextInterval : intervals){
            int nextStart = nextInterval[0];
            int nextEnd = nextInterval[1];
            int currentEnd = currentInterval[1];

            if(currentEnd >= nextStart){
                currentInterval[1] = Math.max(currentEnd,nextEnd);
            }else{
                currentInterval = nextInterval;
                mergedArray.add(currentInterval);
            }

        }

        return mergedArray.toArray(new int[mergedArray.size()][]);
    }
}
