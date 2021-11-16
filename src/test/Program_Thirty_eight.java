package test;

import java.util.List;

public class Program_Thirty_eight {

        public static BST minHeightBst(List<Integer> array) {
            // Write your code here.
            return constructMinHeightBST(array,null,0,array.size()-1);
        }

        public static  BST constructMinHeightBST(List<Integer> array, BST bst, int startIndex, int endIndex){
            if(startIndex < endIndex)
                return null;

                int midIndex = (startIndex + endIndex)/2;
                int nodeValue = array.get(midIndex);

                if(bst == null){
                    bst = new BST(nodeValue);
                }else{
                    bst.insert(nodeValue);
                }

                constructMinHeightBST(array,bst,startIndex,midIndex);
                constructMinHeightBST(array,bst,midIndex+1,endIndex);

                return bst;
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

            public void insert(int value) {
                if (value < this.value) {
                    if (left == null) {
                        left = new BST(value);
                    } else {
                        left.insert(value);
                    }
                } else {
                    if (right == null) {
                        right = new BST(value);
                    } else {
                        right.insert(value);
                    }
                }
            }
        }
    }

