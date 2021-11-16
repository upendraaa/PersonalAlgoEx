package test;

public class Program_Forty_One {
    public static void invertBinaryTree(BinaryTree tree) {

        if(tree != null){
            BinaryTree tempNode = tree.left;
            tree.left = tree.right;
            tree.right = tempNode;
            invertBinaryTree(tree.left);
            invertBinaryTree(tree.right);

        }

        if(tree.right !=null){
            BinaryTree tempNode = tree.right;
            tree.right = tree.left;
            tree.left = tempNode;
        }
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
