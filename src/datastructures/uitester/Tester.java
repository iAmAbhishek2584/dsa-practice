package datastructures.uitester;

import datastructures.Trees.BinarySearchTree;
import datastructures.doubleylinkedlists.DoubleyLinkedList;
import datastructures.graphs.Graph;
import datastructures.hashtables.HashTable;
import datastructures.heaps.Heap;
import datastructures.linkedlists.LinkedList;
import datastructures.queues.Queue;
import datastructures.sorts.*;
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


//        HashTable ht = new HashTable();
//
//        ht.printTable();
//        ht.set("banana", 12);
//        ht.set("apple", 20);
//        ht.set("mango", 13);
//
//        System.out.println(ht.keys());

//        Graph graph = new Graph();
//
//       graph.addVertex("A");
//       graph.addVertex("B");
//       graph.addVertex("C");
//       graph.addVertex("D");
//
//       graph.addEdge("A", "B");
//       graph.addEdge("A", "C");
//       graph.addEdge("A", "D");
//       graph.addEdge("B", "D");
//       graph.addEdge("C", "D");
//
//       graph.printGraph();
//
////       graph.removeEdge("A", "B");
//        graph.removeVertex("D");
//
//       graph.printGraph();

//        Heap heap = new Heap();
//        heap.insert(95);
//        heap.insert(75);
//        heap.insert(80);
//        heap.insert(55);
//        heap.insert(60);
//        heap.insert(50);
//        heap.insert(65);
//
//        System.out.println(heap.getHeap());
//
//        heap.remove();
//
//        System.out.println(heap.getHeap());
//
//        heap.remove();
//
//        System.out.println(heap.getHeap());

//        BinarySearchTree bts = new BinarySearchTree();
//
//        bts.rInsert(47);
//        bts.rInsert(21);
//        bts.rInsert(76);
//        bts.rInsert(18);
//        bts.rInsert(27);
//        bts.rInsert(52);
//        bts.rInsert(82 );
//
//        System.out.println(bts.DFSInOrder());

        int [] arr = {11, 10, 5, 3, 1};

        Bubble bubble = new Bubble();
        Selection selectionSort = new Selection();
        Insertion insertionSort = new Insertion();
        Merge mergeSort = new Merge();
        Quick quickSort = new Quick();

//        bubble.sort(arr);
//        selectionSort.sort(arr);
//        insertionSort.sort(arr);

        quickSort.sort(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
