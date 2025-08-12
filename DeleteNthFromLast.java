package com.palle;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNthFromLast {
    Node head;

    public void deleteNthFromLast(int n) {
        Node first = head;
        Node second = head;

        // Move first pointer n nodes ahead
        for (int i = 0; i < n; i++) {
            if (first == null) {
                System.out.println("n is greater than the length of the list");
                return;
            }
            first = first.next;
        }

        // If first is null, that means we need to delete the head node
        if (first == null) {
            head = head.next;
            return;
        }

        // Move both pointers one step at a time until first reaches the end
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }
    public static void main(String[] args) {
        DeleteNthFromLast list = new DeleteNthFromLast();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        System.out.println("Original List:");
        list.printList();

        list.deleteNthFromLast(2);

        System.out.println("List after deleting 2nd node from last:");
        list.printList();
    }
}



