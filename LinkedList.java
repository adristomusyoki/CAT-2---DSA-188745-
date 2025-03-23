public class LinkedList {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data; 
            this.next = null;
        }
    }

    private Node head;

    
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        if (newNode == null) {
            System.out.println("OVERFLOW - Unable to allocate memory.");
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
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

    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("UNDERFLOW - The list is empty.");
            return;
        }
        head = head.next;
    }

    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(20);
        list.insertAtBeginning(21);
        list.insertAtEnd(23);
        list.display();

        list.deleteFromBeginning();
        list.display();
    }
}
