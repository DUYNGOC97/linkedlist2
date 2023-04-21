package linkedlist2;

public class Test {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<Integer> myList = new MyLinkedList<Integer>(10);
        for (int numb = 11; numb <= 15; numb++) {
            myList.addFirst(numb);
        }
        myList.printList();
        System.out.println();
        myList.add(2, 9);
        myList.add(4, 8);
        myList.addLast(20);
        myList.remove(3);
        myList.printList();
        myList.remove((Integer) 8);
        System.out.println();
        myList.printList();
        System.out.println();
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());

    }
}
