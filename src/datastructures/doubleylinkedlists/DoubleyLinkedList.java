package datastructures.doubleylinkedlists;

public class DoubleyLinkedList {

    private Node head;
    private Node tail;
    private int length;


     public class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }

         public int getValue() {
             return value;
         }
     }

    public DoubleyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // all the operations

    // append
    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
          tail.next = newNode;
          newNode.prev = tail;
          tail = newNode;
        }
        length++;
    }

    // prepend
    public void prepend(int value) {
         Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    // get
    public Node get(int index) {
         if (index < 0 || index >= length) {
             return null;
         }

         Node temp;

         if (index < length/2) {
            temp = head;

             for (int i =0; i < index; i++) {
                 temp = temp.next;
             }
        } else {
             temp = tail;

             for (int i = length - 1; i > index; i--) {
                 temp = temp.prev;
             }
         }
         return temp;
    }

    // set
    public boolean set(int index, int value) {
         Node temp = get(index);
         if (temp!=null) {
             temp.value = value;
             return true;
         }
         return false;
    }

    // remove at first
    public Node removeAtFirst() {
         if (length == 0) {
             return null;
         }
         Node temp = head;
         if (length == 1) {
             head = null;
             tail = null;
         } else {
             head = head.next;
             head.prev = null;
             tail.next = null;
         }
         length--;
         return temp;
    }

    // remove at last

    public Node removeAtLast() {
        if (length == 0) {
            return null;
        }
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    // insert
    public boolean insert (int index, int value) {
         if (index < 0 || index > length) {
             return false;
         }
         if (index == 0) {
             prepend(value);
             return true;
         }
         if (index == length) {
             append(value);
             return true;
         }

         Node newNode = new Node(value);
         Node before = get(index - 1);
         Node after = before.next;

         newNode.prev = before;
         newNode.next = after;
         before.next = newNode;
         after.prev = newNode;
         length++;
         return true;
    }

    // remove
    public Node remove(int index) {
         if (index < 0 || index > length) {
             return null;
         }
         if (index == 0) {
             return removeAtFirst();
         }
         if (index == length) {
            removeAtLast();
         }

         Node temp = get(index);
         temp.next.prev = temp.prev;
         temp.prev.next = temp.next;
         temp.next = null;
         temp.prev = null;
         length--;

         return temp;
    }




    // print all nodes
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // getters for linkedlist

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
