package datastructures.Trees;

public class BinarySearchTree {

    private Node root;



    // operations

    // 1. insert
    public void insert(int value) {

        Node node = new Node(value);

        if (root == null) {
            root = node;
        } else {

        }
    }

    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
