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
        else{ //In node insertion of element is done in between
                newNode.next = head;
                head = newNode;
            }
        }

        /*public void deletelastnode(){
        if(head==null||head.next==null)
            head = null;
        else{
            Node current = head;
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }
        }

         */
        public void display() {
            //To delete first node change head to next node
            head = head.next;
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
        }
            System.out.println("NULL");
    }
}
