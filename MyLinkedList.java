package linkedlist2;

import demo7.LinkedList;

import java.util.Scanner;

public class MyLinkedList<E> {
    Node head;
    int numNode;

    public MyLinkedList(Node head, int numNode) {
        this.head = head;
        this.numNode = numNode;
    }

    public MyLinkedList(E data) {
        this.head = new Node(data);
        numNode++;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getNumNode() {
        return numNode;
    }

    public void setNumNode(int numNode) {
        this.numNode = numNode;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNode++;
    }

    public void add(int index, E data) {
        Node temp = head;
        Node holder;
        for (int count = 0; (count < (index - 1)) && (temp.next != null); count++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNode++;
    }

    public void addLast(E data) {
        Node temp = head;
        while (temp.next != null) {
           temp = temp.next;
        }
        temp.next = new Node(data);
        numNode++;
    }
    public boolean add(E data){
        boolean check = true;
        if(head == null){
            check=false;
        }else {
            addLast(data);
        }
        return check;
    }
    public E remove(int index){
        Node temp = head;
        for(int count=0; count<index-1;count++){
            temp = temp.next;
        }
        Node removeNode = temp.next;
        temp.next= removeNode.next;
        Node nullNode = new Node(null);
        removeNode.next = nullNode;
       numNode--;
        return (E) removeNode.getData();
    }
    public boolean remove(E data) {
        boolean check = false;
        if (head == null || contains(data) == false) {
            return check;
        } else {
            Node temp = head;
            for (int count = 0; count < indexOf(data) - 1  ; count++) {
                temp = temp.next;
            }
            Node removeNode = temp.next;
            temp.next = removeNode.next;
            Node nullNode = new Node(null);
            removeNode.next = nullNode;
            numNode--;
            check = true;
        }
        return check;
    }

    public int size() {
        return numNode;
    }

    public boolean contains(E data) {
        boolean check = false;
        if (head == null) {
            return check;
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.getData() == data) {
                    check = true;
                    break;
                }
                temp = temp.next;
            }
        }
        return check;
    }

    public int indexOf(E data) {
        int count = 0;
        if (head == null) {
            return -1;
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.getData() == data) {
                    break;
                }
                count++;
                temp = temp.next;
            }
        }
        return count;
    }

    public E get(int index) {
        Node temp = head;
        for (int count = 0; count < index; count++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public E getFirst() {
        return (E) head.getData();
    }

    public E getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public void clear() {
        head = null;
        numNode = 0;
    }

    public void printList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Empty list");
        } else {
            for (int count = 0; count < numNode; count++) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
