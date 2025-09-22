package datastructures.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    // recursive delete
    private Node rDelete(Node currentNode, int value) {
        if (currentNode == null) return null;

        if (value < currentNode.value) {
            currentNode.left = rDelete(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rDelete(currentNode.right, value);
        } else {

            if(currentNode.left == null && currentNode.right == null) return null;
            else if (currentNode.left == null) currentNode = currentNode.right;
            else if(currentNode.right == null) currentNode = currentNode.left;

            else {
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = rDelete(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
    }

    public void rDelete(int value) {
        root = rDelete(root, value);
    }

    // helper method
    private int minValue(Node currentNode) {
        while (currentNode.left!=null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
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

    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traversal {
            public Traversal (Node currentNode) {
                results.add(currentNode.value);

                if (currentNode.left != null) {
                    new Traversal(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traversal(currentNode.right);
                }
            }
        }
        new Traversal(root);
        return results;
    }

    public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traversal {
            public Traversal (Node currentNode) {
                if (currentNode.left != null) {
                    new Traversal(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traversal(currentNode.right);
                }
                results.add(currentNode.value);
            }
        }
        new Traversal(root);
        return results;
    }

    public ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traversal {
            public Traversal (Node currentNode) {
                if (currentNode.left != null) {
                    new Traversal(currentNode.left);
                }
                results.add(currentNode.value);
                if (currentNode.right != null) {
                    new Traversal(currentNode.right);
                }
            }
        }
        new Traversal(root);
        return results;
    }

    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            results.add(currentNode.value);

            if (currentNode.left!=null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right!=null) {
                queue.add(currentNode.right);
            }
        }
        return results;
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
