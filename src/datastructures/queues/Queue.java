package datastructures.queues;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public Queue(int value) {
        Node node = new Node(value);
        first = node;
        last = node;
        length = 1;
    }

    public void enqueue(int value) {
        Node node = new Node(value);
        if (length == 0) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        length++;
    }

    public Node dequeue() {
        Node temp = first;

        if (length == 0) return null;

        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
