package test;

class Program_Forty_Five {
    public static int maxSubsetSumNoAdjacent(int[] array) {
        if(array.length == 0){
            return 0;
        }else if(array.length == 1){
            return  array[0];
        }

        int sMax = array[0];
        int max = Math.max(array[0], array[1]);
        for(int i =2; i< array.length ; i++){
            int current = Math.max(max, sMax+array[i]);
            sMax = max;
            max = current;
        }

        return max;
    }
}
