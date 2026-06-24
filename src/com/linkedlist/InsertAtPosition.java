package com.linkedlist;

public class InsertAtPosition{

    Node head;

    // Insert at Beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at End
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
    }

    // Insert at Position
    void insertAtPosition(int position, int data) {

        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ---> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

    	InsertAtPosition list =
                new InsertAtPosition();

        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.insertAtPosition(2, 25);

        list.display();
    }
}
