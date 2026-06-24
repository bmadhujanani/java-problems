package com.linkedlist;



public class DoublyLinkedList {

    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }

        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    void displayForward() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    void displayBackward() {
        if (head == null) return;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    
    
    
    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }
    

    void deleteAtEnd() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If only one node exists
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        // Move to second-last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }
    
    
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    
    

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtBeginning(0);

        System.out.println("Forward Traversal:");
        list.displayForward();

        System.out.println("Backward Traversal:");
        list.displayBackward();
        list.deleteAtBeginning();
        list.display();
        list.deleteAtEnd();
        list.display();
    }
}
