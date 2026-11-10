package src.main.java.com.dsa.linkedlist;


public class GenericSingleLinkedList<T> {
    Node<T> head;
    int size;

    public static void main(String[] args) {

    }

    private void add(T data){

    }

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
