import test.*;

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


      /*  int [] array = {-19,-10,1,2,3,4,5,6,7,8,9};
        int [] result = Program_three.sortedSquaredArray(array);
        System.out.println(Arrays.deepToString(new int[][]{result}));


        System.out.println(Math.abs((110-100)));
        System.out.println(Math.abs((100-110)));*/

       /* int [] array1 = {5,8,1,3,4};
        int [] array2 = {6,9,2,4,5};

        System.out.println(Program_eleven.classPhotos( (ArrayList)Arrays.stream(array1).boxed().collect(Collectors.toList())
                , (ArrayList)Arrays.stream(array2).boxed().collect(Collectors.toList())));*/


        Program_twelve.LinkedList root = null;

     /*   int [] array = {1,1,3,4,4,4,5,6,6};
        Program_twelve.LinkedList next = null;
        for(int i: array){

            if(root == null){
                root = new Program_twelve.LinkedList(i);
                next = root;
            }else
            {
              Program_twelve.LinkedList new_node = new Program_twelve.LinkedList(i);
              next.next = new_node;
              next = next.next;
            }
        }

        System.out.println(Program_twelve.removeDuplicatesFromLinkedList(root));*/

      /*  System.out.println(Program_thirteen.getNthFib(6)+",");

        List<Object> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        List<Object> child = new ArrayList<>();
        child.add(7);
        child.add(-1);
        list.add(child);
        list.add(3);
         child = new ArrayList<>();
         child.add(6);
         List<Object> secChild = new ArrayList<>();
         secChild.add(-13);
         secChild.add(8);
         child.add(secChild);
         child.add(4);
         list.add(child);

         Program_fourteen.productSum(list);*/

        int [] array = {0,1,21,33,45,45,61,71,72,73};
        System.out.println(Program_fifteen.binarySearch(array,33)+"");




    }
}
