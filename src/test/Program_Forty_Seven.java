package test;

public class Program_Forty_Seven {
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        int[] numberOfWays = new int[n+1];
        numberOfWays[0] = 1;
        for( int denom: denoms){
            for(int amount =1; amount <n+1; amount++){
                if(denom <= amount){
                    numberOfWays[amount] =
                            numberOfWays[amount] + numberOfWays[amount - denom];
                }
            }
        }
        return numberOfWays[n];
    }
}

