package test;

import java.util.*;

class Program_seven {
    // This is the class of the input root. Do not edit it.

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




    }

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }



    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        branchSum(root,root.value,list);
        return list;
    }

    static void branchSum(BinaryTree tree, int lastSum, ArrayList<Integer> list) {

        if (tree == null) {
            return;
        }
        lastSum = lastSum + tree.value;

        if (tree.left == null && tree.right == null) {
            list.add(lastSum);
            return;
        }
        branchSum(tree.left, lastSum, list);
        branchSum(tree.right, lastSum, list);
    }
}
