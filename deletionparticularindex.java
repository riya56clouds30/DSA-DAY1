class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ListOfFunctions {
    static Node head; // global head

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void addfirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void deleteindex(int index) {
        if (head == null) {
            System.out.println("No data");
            return;
        }
        if (index == 0) { // delete first node
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Index out of range");
            return;
        }

        // Delete node at index
        temp.next = temp.next.next;
    }
}

// Main class must be outside ListOfFunctions
public class deletionparticularindex {
    public static void main(String[] args) {
        ListOfFunctions.insert(10);
        ListOfFunctions.insert(50);
        ListOfFunctions.insert(20);
        ListOfFunctions.insert(60);
        ListOfFunctions.addfirst(70);

        System.out.println("Original List:");
        ListOfFunctions.display();

        ListOfFunctions.deleteindex(2); // delete node at index 2
        System.out.println("List after deletion:");
        ListOfFunctions.display();
    }
}
