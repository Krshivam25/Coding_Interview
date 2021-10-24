public class DoublyLinkedList {
    // Represent a node of doubly ll
    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;

        }
    }

    Node head, tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }

    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("Node of doubly linked list is empty");
            return;
        }
        System.out.println("Node of doubly:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dd = new DoublyLinkedList();
        dd.addNode(2);
        dd.addNode(3);
        dd.addNode(5);
        dd.addNode(6);

        dd.display();
    }

}
