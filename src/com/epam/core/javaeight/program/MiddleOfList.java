package com.epam.core.javaeight.program;

public class MiddleOfList {
    public static void main(String[] args) {

       Node node = new Node(1);
       node.next = new Node(2);
       node.next.next = new Node(3);
       node.next.next.next = new Node(4);



    }


    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
}
