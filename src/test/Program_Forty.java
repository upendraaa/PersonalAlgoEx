package test;
import java.util.*;


public class Program_Forty {
    // This is an input class. Do not edit.
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    static class TreeInfo{
        public int rootIndex;

        public TreeInfo(int rootIndex){
            this.rootIndex = rootIndex;
        }
    }

    public BST reconstructBst(
            ArrayList<Integer> preOrderTraversalValues) {
          TreeInfo treeInfo = new TreeInfo(0);
          return  reconstructBSTFromRange(Integer.MIN_VALUE,
                  Integer.MAX_VALUE,preOrderTraversalValues,treeInfo);

    }

     public BST reconstructBSTFromRange(
             int min, int max, List<Integer> preOrderTraversalValues,
             TreeInfo treeInfo){

     if(treeInfo.rootIndex == preOrderTraversalValues.size()){
         return null;
     }
     int rootValue = preOrderTraversalValues.get(treeInfo.rootIndex);
     if(rootValue < min || rootValue >=max){
         return null;
     }

     treeInfo.rootIndex += 1;
     BST leftNodes = reconstructBSTFromRange(min, rootValue, preOrderTraversalValues,treeInfo);
     BST rightNodes = reconstructBSTFromRange(rootValue,max,preOrderTraversalValues,treeInfo);

             BST bst = new BST(rootValue);
             bst.left = leftNodes;
             bst.right = rightNodes;
             return bst;
     }
}

