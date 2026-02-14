package src.main.java.com.dsa.linkedlist;

public class CustomSingleLinkedList {
    private  int size;
    public   Node head;

    public static void main(String[] args) {
        CustomSingleLinkedList customSingleLinkedList=new CustomSingleLinkedList();
        customSingleLinkedList.add(12);
        customSingleLinkedList.add(11);
        customSingleLinkedList.add(21);
        printCustomList(customSingleLinkedList);
    }

    private static void printCustomList(CustomSingleLinkedList list) {
        if (list.head==null){
            System.out.println("null");
            return;
        }
        Node currNode = list.head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }


    private void add(int data){
        if (head==null){
            // no data inserted yet
            Node newNode=new Node(data);
            head=newNode;
            newNode.next=null;
            size++;
            return;
        }
        // if head not null check if it is tail
        Node currNode=head;
        while (currNode.next!=null){
            // tail is not yet captured move ahead
            currNode=currNode.next;
        }
        // once currNode has tail add new value there
        Node newNode=new Node(data);
        currNode.next=newNode;
        newNode.next=null;
        size++;
    }











    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

}
