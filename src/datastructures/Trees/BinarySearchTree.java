package datastructures.Trees;

public class BinarySearchTree {

    private Node root;


    public Node getRoot() {
        return root;
    }

    // operations

    // 1. insert
    public boolean insert(int value) {

        Node node = new Node(value);

        if (root == null) {
            root = node;
            return true;
        }

        Node temp = root;

        while (true) {
            if (node.value == temp.value) return false;



            if (node.value < temp.value) {

                if (temp.left == null) {
                    temp.left = node;
                    return true;
                }

                temp = temp.left;

            } else {

                if (temp.right == null) {
                    temp.right = node;
                    return true;
                }

                temp = temp.right;

            }
        }
    }

    // recursive insert
    private Node rInsert(Node currentNode, int value) {

        if (currentNode == null) return new Node(value);

        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert (int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }


    // recursive contains

    private boolean rContains(Node currentNode, int value) {

        if (currentNode == null) return false;
        if (currentNode.value == value) return true;

        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }

    public boolean contains (int value) {
        Node temp = root;

        while (temp != null) {
            if (value == temp.value) return true;

            temp =  (value < temp.value) ? temp.left : temp.right;
        }
        return false;
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

        public Node getLeft() {return left;}

        public Node getRight() {return right;}
    }
}
