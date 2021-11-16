package test;

import java.util.ArrayList;

public class Program_thirty_nine {
    // This is an input class. Do not edit.
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public int findKthLargestValueInBst(BST tree, int k) {
        ArrayList<Integer> inorderList = new ArrayList<>();
        inorderTraverse(tree,inorderList);


        return inorderList.get(inorderList.size() - k);
    }

    public void inorderTraverse(BST tree, ArrayList<Integer> inorderList){
        if(tree == null){
            return;
        }
        inorderTraverse(tree.left,inorderList);
        inorderList.add(tree.value);
        inorderTraverse(tree.right,inorderList);
    }


}

