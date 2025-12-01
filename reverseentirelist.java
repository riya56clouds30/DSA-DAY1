/* Create a function to reverse a singly linked list 
   Logic: Swapping Links (not numbers)
*/

class Node {
    int data;       // stores data
    Node next;      // reference to next node

    Node(int data) {
        this.data = data;  
        this.next = null;  // next initially null
    }
}

class ListOfFunctions {

    static Node head;  // global head for the linked list

    // Function to display the entire linked list
    public static void display() {
        Node temp = head; 

        while (temp != null) {         // traverse until end of list
            System.out.print(temp.data + "->");
            temp = temp.next;          // move to next node
        }

        System.out.println("null");    // end of list
    }

    // Insert node at the beginning of the list
    public static void addfirst(int data) {
        Node newNode = new Node(data); // create new node

        newNode.next = head;           // point new node to current head
        head = newNode;                // update head
    }

    // Insert node at the end of the list
    public static void insert(int data) {
        Node newNode = new Node(data); // create new node

        if (head == null) {            // if list is empty
            head = newNode;            // new node becomes head
            return;
        }

        Node temp = head;

        while (temp.next != null) {    // move to last node
            temp = temp.next;
        }

        temp.next = newNode;           // attach new node at end
    }

    // Reverse the entire linked list
    public static void reverse() {
        Node prev = null;              // previous node pointer
        Node current = head;           // current node pointer
        Node next;                     // pointer to store next node

        while (current != null) {      // traverse list
            next = current.next;       // temporarily store next node
            current.next = prev;       // reverse current node's pointer
            prev = current;            // move prev to current node
            current = next;            // move current to next node
        }

        head = prev;                   // update head to last processed node
    }
}

public class reverseentirelist {
    public static void main(String[] args) {

        // inserting values in the list
        ListOfFunctions.insert(10);
        ListOfFunctions.insert(50);
        ListOfFunctions.insert(20);
        ListOfFunctions.insert(60);
        ListOfFunctions.addfirst(70);   // adding at first

        System.out.println("Original List:");
        ListOfFunctions.display();      // display list before reversing

        ListOfFunctions.reverse();      // reverse the linked list

        System.out.println("Reversed List:");
        ListOfFunctions.display();      // display list after reversing
    }
}
