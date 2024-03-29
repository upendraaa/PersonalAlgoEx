package test;

import java.util.ArrayList;
import java.util.List;

public class Program_Thirty_Seven {

    //LNR
    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {

        if(array == null){
            array = new ArrayList<>();
        }

        if (tree.left != null){
            inOrderTraverse(tree.left ,array);
        }

       array.add(tree.value);

        if (tree.right != null){
            inOrderTraverse(tree.right,array);
        }

        return array;
    }
//NLR
    public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
        // Write your code here.
        if(array == null){
            array = new ArrayList<>();
        }
        array.add(tree.value);

        if (tree.left != null){
            preOrderTraverse(tree.left ,array);
        }

        if (tree.right != null){
            preOrderTraverse(tree.right,array);
        }

        return array;
    }
//LRN
    public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
        // Write your code here.
        if(array == null){
            array = new ArrayList<>();
        }

        if (tree.left != null){
            postOrderTraverse(tree.left ,array);
        }
        if (tree.right != null){
            postOrderTraverse(tree.right,array);
        }

        array.add(tree.value);

        return array;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
