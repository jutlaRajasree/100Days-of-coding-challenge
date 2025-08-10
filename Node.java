package com.palle;
import java.util.*;


public class Node {
	 int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedList {
	    Node head;

	    public void addNode(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node lastNode = head;
	            while (lastNode.next != null) {
	                lastNode = lastNode.next;
	            }
	            lastNode.next = newNode;
	        }
	    }

	    public void insertAtPosition(int data, int position) {
	        Node newNode = new Node(data);
	        if (position == 0) {
	            newNode.next = head;
	            head = newNode;
	        } else {
	            Node currentNode = head;
	            int currentPosition = 0;
	            while (currentNode != null && currentPosition < position - 1) {
	                currentNode = currentNode.next;
	                currentPosition++;
	            }
	            if (currentNode == null) {
	                System.out.println("Position exceeds the length of the list.");
	                return;
	            }
	            newNode.next = currentNode.next;
	            currentNode.next = newNode;
	        }
	    }
	    public void printList() {
	        Node currentNode = head;
	        while (currentNode != null) {
	            System.out.print(currentNode.data + " ");
	            currentNode = currentNode.next;
	        }
	        System.out.println();
	    }
	}

	 class InsertAtPosition {
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.addNode(1);
	        list.addNode(2);
	        list.addNode(3);
	        list.addNode(5);

	        System.out.println("Original List:");
	        list.printList();

	        list.insertAtPosition(4, 3);

	        System.out.println("List after insertion:");
	        list.printList();
	    }
	}



	


