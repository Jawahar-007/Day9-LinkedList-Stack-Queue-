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
    public LinkedList(){
        head = null;
    }
    public void insert(int val) {
        Node newNode = new Node(val);
        // Empty List check
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void append(int val){
        Node newNode1 = new Node(val);
        if(head == null)
            head = newNode1;
        else{
            Node current = head;
            while(current!= null){
                current = current.next;
            }
            current.next = newNode1;
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
