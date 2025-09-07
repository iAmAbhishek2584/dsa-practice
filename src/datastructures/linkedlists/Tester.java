package datastructures.linkedlists;

public class Tester {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(5);

        myLinkedList.append(6);
        myLinkedList.append(7);
        myLinkedList.append(8);

        myLinkedList.printList();

        System.out.println("Reversing the linked list");
        myLinkedList.reverse();

        myLinkedList.printList();
    }
}
