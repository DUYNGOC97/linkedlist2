package linkedlist2;

public class Node {
    Node next;
    Object data;

    public Node(Node next, Object data) {
        this.next = next;
        this.data = data;
    }
    public Node(Object data){
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
