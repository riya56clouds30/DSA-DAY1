class Node  {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Listoffunctions {
    static Node head;

    public static void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void addfirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void insert(int data){
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }
}

public class singleLinkedlist {
    public static void main(String args[]) {
        Listoffunctions.addfirst(10);
        Listoffunctions.addfirst(50);
        Listoffunctions.addfirst(20);
        Listoffunctions.addfirst(60);

        Listoffunctions.display();
    }
}
