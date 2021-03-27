package test;

import java.util.*;

class Program_six {
    public static int findClosestValueInBst(BST tree, int target) {
        return getClosestValue(tree,target,tree.value);
    }

    public static int getClosestValue(BST tree,int target, int closestValue) {

        if(Math.abs(closestValue - target) > Math.abs(target - tree.value)){
            closestValue = tree.value;
        }

        if (target < tree.value && tree.left != null) {
            return getClosestValue(tree.left,target,closestValue);
        } else if(tree.right!=null) {
           return getClosestValue(tree.right,target,closestValue);
        }else {
            return closestValue;

        }



    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

    }
}



