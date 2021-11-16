package test;

import java.util.ArrayList;

public class Program_Forty_Threee {

    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        // Write your code here.
        ArrayList<BinaryTree> list = new ArrayList<>();
        inOrder(tree,list);

        int pos = -1;
        for(int i =0 ;i< list.size(); i++){
            if(list.get(i).value == node.value){
               pos = i;
               break;
            }
        }

        if(pos < list.size()-1)
        {
            return list.get(pos+1);
        }

        return null;
    }

    public static void inOrder(BinaryTree tree, ArrayList<BinaryTree> list){

        if(tree==null){
            return;
        }

        if(tree.left !=null){
            inOrder(tree.left,list);
        }
        list.add(tree);
        if(tree.right !=null){
            inOrder(tree.right,list);
        }



    }
}
