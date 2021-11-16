package test;

import java.util.Arrays;
public class Program_Forty_Six {
    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        int[] numberOfCoins = new int[n+1];
        Arrays.fill(numberOfCoins,Integer.MAX_VALUE);
        numberOfCoins[0] = 0;
        int toCompare =0;

        for(int denom : denoms){
            for(int amount =0; amount < numberOfCoins.length ; amount++){
                if(denom <= amount){
                    if(numberOfCoins[amount - denom] == Integer.MAX_VALUE){
                        toCompare = numberOfCoins[amount - denom];
                    }else{
                        toCompare = numberOfCoins[amount - denom]+1;
                    }
                    numberOfCoins[amount] = Math.min(numberOfCoins[amount],toCompare);
                }
            }
        }

        return numberOfCoins[n] != Integer.MAX_VALUE ? numberOfCoins[n] : -1;
    }
}
