package datastructures.uitester;

import datastructures.doubleylinkedlists.DoubleyLinkedList;
import datastructures.linkedlists.LinkedList;

public class Tester {

    public static void main(String[] args) {
        DoubleyLinkedList ddl = new DoubleyLinkedList(5);
        ddl.append(6);
        ddl.append(7);
        ddl.append(8);

        ddl.set(3, 10);

        System.out.println("Inserting at index 1 status : " + ddl.insert(1, 0));
        System.out.println("Element removed from index 2: " + ddl.remove(2).getValue());

        ddl.printList();
    }
}
