package datastructures.uitester;

import datastructures.Trees.BinarySearchTree;
import datastructures.doubleylinkedlists.DoubleyLinkedList;
import datastructures.hashtables.HashTable;
import datastructures.linkedlists.LinkedList;
import datastructures.queues.Queue;
import datastructures.stacks.Stack;

import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {
//        Stack stack = new Stack(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//
//        stack.printStack();
//
//        System.out.println("Pop operation: " + stack.pop().getValue());
//        System.out.println("Pop operation: " + stack.pop().getValue());
//
//        stack.printStack();

//        Queue queue = new Queue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.enqueue(5);
//
//        queue.printQueue();
//
//        System.out.println("Dequeing : " + queue.dequeue().getValue());
//        System.out.println("Dequeing : " + queue.dequeue().getValue());
//
//        queue.printQueue();

//        BinarySearchTree bts = new BinarySearchTree();
//
//        bts.insert(47);
//        bts.insert(21);
//        bts.insert(76);
//        bts.insert(18);
//        bts.insert(52);
//        bts.insert(82);
//
//        System.out.println(bts.getRoot().getRight().getRight().getValue());
//
//        System.out.println(bts.contains(18));


        HashTable ht = new HashTable();

//        ht.printTable();
        ht.set("banana", 12);
        ht.set("apple", 20);
        ht.set("mango", 13);

        System.out.println(ht.keys());


    }
}
