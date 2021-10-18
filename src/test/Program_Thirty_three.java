package test;

public class Program_Thirty_three {

    public int firstDuplicateValue(int[] array) {
        int duplicateValue =-1;
        int firstPos = -1;
        int lastPos = array.length;
        for(int i =0;i< array.length-1 ;i++){
            for(int j =i+1; j< array.length;j++){
                if(array[i] == array[j] &&  array[i] != duplicateValue && j < lastPos){
                    duplicateValue = array[i];
                    firstPos = i;
                    lastPos = j;
                }
            }
        }
        return duplicateValue;
    }
}
