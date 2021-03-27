package test;

import java.util.*;

class Program_eight {


    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(1);
        binaryTree.left = new BinaryTree(2);
        binaryTree.right = new BinaryTree(3);

        binaryTree.left.left = new BinaryTree(4);
        binaryTree.left.right = new BinaryTree(5);

        binaryTree.left.left.left = new BinaryTree(8);
        binaryTree.left.left.right = new BinaryTree(9);


        binaryTree.right.left = new BinaryTree(6);
        binaryTree.right.right = new BinaryTree(7);
        
        int sum = nodeDepths(binaryTree);
        System.out.println("Sum "+ sum);
    }

    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        ArrayList<Integer> sums = new ArrayList<>();
        int sum = 0;
        sum(root,-1,sums);
        for(Integer i: sums){
            sum = sum +i;
        }
        return sum ;
    }

    public static void sum(BinaryTree tree, int branch, ArrayList<Integer> sums){
        if(tree == null)
        {
            return;
        }
         branch = branch +1;
         sums.add(branch);
        if(tree.left == null && tree.right == null){
            /*int temp = branch;
            int sum = 0;
            while (temp>0){
                sum = sum + temp--;
            }
            sums.add(sum);*/
            return;
        }
        sum(tree.left,branch,sums);
        sum(tree.right,branch,sums);
    }



    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}

