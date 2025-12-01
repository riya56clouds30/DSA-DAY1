// Node class represents a single element of the linked list
class Node {
    int data;       // stores the value
    Node next;      // stores reference to next node

    // Constructor to create a new node
    Node(int data){
        this.data = data;
        this.next = null;   // next is initially null
    }
}

// Class that contains all linked list operations (functions)
class Listoffunctions {
    static Node head;   // head refers to the first node of the list

    // Insert a node at the beginning of the list
    public static void addfirst(int data){
        Node newNode = new Node(data);   // create new node
        newNode.next = head;             // link new node to current head
        head = newNode;                  // update head to new node
    }

    // Count the number of nodes in the linked list
    public static int count(){
        int count = 0;           // start the counter
        Node temp = head;        // pointer starts from head

        // traverse through each node until temp becomes null
        while(temp != null){
            count++;             // count this node
            temp = temp.next;    // move to the next node
        }

        return count;            // return total count
    }

    // Display all nodes in the linked list
    public static void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Main class where execution begins
public class countofnodes {
    public static void main(String[] args){

        // Add nodes at the beginning of the list
        Listoffunctions.addfirst(10);
        Listoffunctions.addfirst(50);
        Listoffunctions.addfirst(20);
        Listoffunctions.addfirst(60);

        // Display the linked list
        System.out.println("Linked List:");
        Listoffunctions.display();

        // Print the total number of nodes
        System.out.println("Total number of nodes = " + Listoffunctions.count());
    }
}
