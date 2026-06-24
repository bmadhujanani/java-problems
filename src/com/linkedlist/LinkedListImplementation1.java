package com.linkedlist;

public class LinkedListImplementation1{
		Node head;
		void insertAtBegining(int data) {
			Node newNode=new Node(data);
			newNode.next=head;
			head=newNode;
		}
		void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.print("null");
		}
		
		void insertAtEnd(int data) {
			Node newNode = new Node(data);
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			
		}
		 public static void main(String[] args) { 

			 LinkedListImplementation1 list =
		                new LinkedListImplementation1();

		        list.insertAtBegining(10);
		        list.insertAtBegining(20);
		        list.insertAtBegining(50);
		        list.insertAtBegining(40);

		        list.display();
		        list.insertAtEnd(100);
		        list.display();
		    }
		}
