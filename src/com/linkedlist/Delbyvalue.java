package com.linkedlist;

public class Delbyvalue{
	Node head;

    void insertAtBegining(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    void deleteByValue(int value) {

        if (head == null) {
            return;
        }

        // Delete head node
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
    
    
    void updateAtPosition(int position, int newValue) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position <= 0) {
            System.out.println("Invalid Position");
            return;
        }

        Node temp = head;
        int index = 1;

        while (temp != null && index < position) {
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        temp.data = newValue;
    }
    
    void updateByValue(int oldValue, int newValue) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == oldValue) {
                temp.data = newValue;
                return; // updates first occurrence only
            }

            temp = temp.next;
        }

        System.out.println("Value not found");
    }
    
    
    int countNodes() {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
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

        Delbyvalue list =
                new Delbyvalue();

        list.insertAtBegining(10);
        list.insertAtBegining(20);
        list.insertAtBegining(30);
        list.insertAtBegining(40);

        list.display();

        list.deleteByValue(30);
        
        list.display();

        list.updateAtPosition(2, 99);

        list.display();
        list.updateByValue(20, 99);
        list.display();
        System.out.println("Number of nodes: " + list.countNodes());
    }
}