package com.palle;

public class DeleteNode {
	  int data;
	    Node next;

	    public DeleteNode(int data) {
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

	    public void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        if (position == 0) {
	            head = head.next;
	        }
	        else {
	            Node currentNode = head;
	            int currentPosition = 0;
	            while (currentNode != null && currentPosition < position - 1) {
	                currentNode = currentNode.next;
	                currentPosition++;
	            }
	            if (currentNode == null || currentNode.next == null) {
	                System.out.println("Position exceeds the length of the list.");
	                return;
	            }
	            currentNode.next = currentNode.next.next;
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

	 class DeleteAtPosition {
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.addNode(1);
	        list.addNode(2);
	        list.addNode(3);
	        list.addNode(4);
	        list.addNode(5);
	        System.out.println("Original List:");
	        list.printList();

	        list.deleteAtPosition(2);

	        System.out.println("List after deletion:");
	        list.printList();
	    }
	}






