import test.Program_three;
import test.Program_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Program p = new Program();
       /* int[] array = new int[] {3,5,-4,8,11,1,-1,6};
        int targetSum = 10;
        int [] result = Program.twoNumberSum(array,targetSum);
        System.out.println(Arrays.deepToString(new int[][]{result}));*/

      /*  List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(22);
        list.add(25);

        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(22);
        sequence.add(25);

        Boolean val = Program_two.isValidSubsequence(list,sequence);
        System.out.println(val.toString());*/

       /* int[] array= {5, 1, 22, 25, 6, -1, 8, 10};
        int [] sequenceArray=  {1, 6, -1, -1};

        Boolean val = Program_two.isValidSubsequence( Arrays.stream(array).boxed().collect(Collectors.toList())
                ,Arrays.stream(sequenceArray).boxed().collect(Collectors.toList()));
        System.out.println(val.toString());*/


        int [] array = {-19,-10,1,2,3,4,5,6,7,8,9};
        int [] result = Program_three.sortedSquaredArray(array);
        System.out.println(Arrays.deepToString(new int[][]{result}));


        System.out.println(Math.abs((110-100)));
        System.out.println(Math.abs((100-110)));



    }
}
