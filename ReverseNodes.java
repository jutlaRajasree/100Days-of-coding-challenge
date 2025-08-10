package com.palle;

public class ReverseNodes {
	
	 int data;
	    Node next;

	    public ReverseNodes(int data) {
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

	    public void printReverse() {
	        printReverseRecursive(head);
	    }

	    private void printReverseRecursive(Node node) {
	        if (node == null) {
	        	  return;
	        }
	        printReverseRecursive(node.next);
	        System.out.print(node.data + " ");
	    }
	}

	 class PrintReverseLinkedList {
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.addNode(1);
	        list.addNode(2);
	        list.addNode(3);
	        list.addNode(4);
	        list.addNode(5);

	        System.out.println("Original List:");
	        Node currentNode = list.head;
	        while (currentNode != null) {
	            System.out.print(currentNode.data + " ");
	            currentNode = currentNode.next;
	        }
	        System.out.println();

	        System.out.println("Reversed List:");
	        list.printReverse();
	    }
	


	        }



