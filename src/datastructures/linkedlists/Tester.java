package datastructures.linkedlists;

public class Tester {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(5);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.append(6);
        myLinkedList.append(7);
        myLinkedList.append(8);
        myLinkedList.printList();
    }
}
