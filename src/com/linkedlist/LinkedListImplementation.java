package com.linkedlist;

public class LinkedListImplementation {

    Node head;
    

    void insertAtBegining(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ---> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
 
    public static void main(String[] args) {

        LinkedListImplementation list =
                new LinkedListImplementation();

        list.insertAtBegining(10);
        list.insertAtBegining(20);
        list.insertAtBegining(30);
        list.insertAtBegining(40);

        list.display();
    }
}