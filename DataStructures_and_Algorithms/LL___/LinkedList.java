package LL___;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;
    public LinkedList() {
        this.size = 0;
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size ++;
    }

    public void addLast(int val) {
        if(tail == null) {
            addFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public void display() {
        Node temp = head;
        System.out.print("[");
        while (temp.next != null) {
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }
        System.out.println(temp.value + "]");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
