package exercise.oops.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;


    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}

 /*
 Node node = new Node(value);
 node.next = head
 head = node
 if(tail == null){
  tail = head;
  }
 */
