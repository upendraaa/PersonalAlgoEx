package test;

import java.util.*;

class Program_nine {
    // Do not edit the class below except
    // for the depthFirstSearch method.
    // Feel free to add new properties
    // and methods to the class.
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            // Write your code here.
            dfs(this,array);
            return array;
        }

        public static void dfs(Node node, List<String> array){

            if(node == null){
                return;
            }
            array.add(node.name);


            for(int i =0 ;i< node.children.size();i++){
                dfs(node.children.get(i),array);
            }

        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}

