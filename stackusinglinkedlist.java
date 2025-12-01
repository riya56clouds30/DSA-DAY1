class Node {  
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackMethods {

    private static Node top;

    public static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public static void pop() {
        if (top == null) {
            System.out.println("Stack underflow");
            return;  // important
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    public static void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element: " + top.data);
    }

    public static void display() {
        Node temp = top;
        if (temp == null) {
            System.out.println("Stack is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class stackusinglinkedlist {
    public static void main(String[] args) {

        StackMethods.push(10);
        StackMethods.push(20);
        StackMethods.push(30);

        StackMethods.display();
        StackMethods.peek();
        StackMethods.pop();
        StackMethods.display();
    }
}
