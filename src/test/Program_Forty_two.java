package test;

public class Program_Forty_two {
    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public int binaryTreeDiameter(BinaryTree tree) {
        // Write your code here.
        return getTreeInfo(tree).diameter;
    }

    public  TreeInfo getTreeInfo(BinaryTree tree){
        if(tree == null){
            return  new TreeInfo(0,0);
        }

        TreeInfo leftTreeInfo = getTreeInfo(tree.left);
        TreeInfo rightTreeInfo = getTreeInfo(tree.right);

        int longestPathRoot = leftTreeInfo.height + rightTreeInfo.height;
        int maxDiameter = Math.max(leftTreeInfo.diameter ,rightTreeInfo.diameter);
        int currentDiameter = Math.max(longestPathRoot,maxDiameter);
        int currentHeight = 1 + Math.max(leftTreeInfo.height, rightTreeInfo.height);

        return new TreeInfo(currentDiameter,currentHeight);
    }

    static class TreeInfo{
        public  int diameter;
        public int height;

        public TreeInfo(int diameter, int height){
            this.diameter = diameter;
            this.height = height;
        }
    }

}
