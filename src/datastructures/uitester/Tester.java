package datastructures.uitester;

import datastructures.doubleylinkedlists.DoubleyLinkedList;
import datastructures.linkedlists.LinkedList;
import datastructures.queues.Queue;
import datastructures.stacks.Stack;

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

        Queue queue = new Queue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.printQueue();

        System.out.println("Dequeing : " + queue.dequeue().getValue());
        System.out.println("Dequeing : " + queue.dequeue().getValue());

        queue.printQueue();
    }
}
