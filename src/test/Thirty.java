package test;
import java.util.*;

public class Thirty {
    public static List<Integer> spiralTraverse(int[][] array) {

        ArrayList<Integer> list = new ArrayList<>();
        int rowStartIndex =0;
        int columnStartIndex=0;
        int rowEndIndex = array.length-1;
        int columnEndIndex = array[0].length-1;
        int dir =0;
        System.out.println("Row "+rowEndIndex);
        System.out.println("Column "+columnEndIndex);

        if(array.length <=0){
            return list;
        }

        while (rowStartIndex <= rowEndIndex && columnStartIndex <= columnEndIndex){

            for(int i = columnStartIndex;i<=columnEndIndex;i++){
                list.add(array[rowStartIndex][i]);
            }

            for(int i = rowStartIndex+1;i<=rowEndIndex;i++){
                list.add(array[i][columnEndIndex]);
            }

            for(int i = columnEndIndex -1 ;i>= columnStartIndex;i--){
                if(rowStartIndex == rowEndIndex) break;
                list.add(array[rowEndIndex][i]);
            }

            for(int i = rowEndIndex-1; i> rowStartIndex;i--){
                if(columnStartIndex == columnEndIndex) break;
                list.add(array[i][columnStartIndex]);
            }

            rowStartIndex++;
            rowEndIndex--;
            columnStartIndex++;
            columnEndIndex--;


//
//            if(dir ==0 ){
//                for(int i = columnStartIndex;i<= columnEndIndex;i++){
//                    list.add(array[rowStartIndex][i]);
//                }
//                rowStartIndex++;
//                dir = 1;
//            }else if(dir == 1){
//                for (int i = rowStartIndex;i<=rowEndIndex;i++){
//                    list.add(array[i][columnEndIndex]);
//                }
//                columnEndIndex--;
//                dir =2;
//            }else if(dir ==2){
//                for(int i = columnEndIndex; i>= columnStartIndex;i--){
//                    list.add(array[rowEndIndex][i]);
//                }
//                rowEndIndex--;
//                dir =3;
//
//            }else if (dir == 3){
//                for(int i = rowEndIndex;i>= rowStartIndex;i--){
//                    list.add(array[i][columnStartIndex]);
//                }
//                columnStartIndex++;
//                dir =0;
//            }
        }


        return list;
    }
}