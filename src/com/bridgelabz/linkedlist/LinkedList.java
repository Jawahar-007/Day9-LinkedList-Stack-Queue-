package com.bridgelabz.linkedlist;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.next = null;
        this.data = data;
    }
}
public class LinkedList {
    Node head;
    public void LinkedList(){
        head = null;
    }
    public void insert(int val) {
        Node newNode = new Node(val);
        // Empty List check
        if (head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            // To find the last node
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
        public void display() {
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
        }
    }
}
