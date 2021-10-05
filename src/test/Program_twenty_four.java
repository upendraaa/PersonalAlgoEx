package test;

public class Program_twenty_four {


    public int firstNonRepeatingCharacter(String string) {
        int index =-1;
        StringBuilder sb = new StringBuilder("");
        for(int i =0;i< string.toCharArray().length;i++){
            if(!sb.toString().contains(String.valueOf(string.charAt(i)))){
                sb.append(String.valueOf(string.charAt(i)));
                int count1 = getCharCount(string.toCharArray(),string.charAt(i));
                if(count1 == 1){
                    return i;
                }
            }
        }
        return index;
    }

    public static int getCharCount(char[] chars, char c){
        int count =0;
        int i=0;
        while (i<chars.length){
            if(chars[i] == c){
                count++;
            }
            if(count>1){
                return count;
            }
            i++;
        }
        return count;
    }

}
