import java.util.*;

public class Program {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        int fPos=0;
        int sPos=0;
        for (int i = 0;i< array.length-1; i++){

            for(int j=i+1;j<array.length; j++){

                if(targetSum == (array[i]+array[j]))
                {
                    fPos = i;
                    sPos = j;
                    break;
                }
            }

        }
        if(fPos ==0 ){
            return new int[]{targetSum};
        }
        else{
            return new int[]{fPos,sPos};

        }
    }
}

