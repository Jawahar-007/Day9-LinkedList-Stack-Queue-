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
    public void insert(int val,int insertAfterElement) {
        Node newNode = new Node(val);
        // Empty List check
        if (head == null) {
            head = newNode;
        }
        else{ //In node insertion of element is done in between
            Node current = head;
            while(current!= null&&current.data!=insertAfterElement){
                current = current.next;
            }
            if(current!=null){
                newNode.next = current.next;
                current.next = newNode;
            }

        }
    }
        public void display() {
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
        }
            System.out.println("NULL");
    }
}
