public class SinglyLinkedList {

    Node head;

    public SinglyLinkedList() {
        this.head = null;
        System.out.println("Singly linked list object created");
    }

    // it doesnot matter whether there are any nodes or not
    public void InsertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void InsertAtEnd(int data) {
        if (this.head == null) {
            Node newNode = new Node(data);
            newNode.next = this.head;
            this.head = newNode;
        }
        if (this.head != null) {
            head = head.next;
            Node newNode = new Node(data);
            newNode.next = this.head;

        }

    }

    public void PintAllNodesData() {
        if (this.head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Node in the list");

        Node currentNode = this.head;
        while (currentNode != null) {
            System.out.print("" + currentNode.data + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public void testAllOperations() {
        this.InsertAtBeginning(1);
        this.InsertAtBeginning(2);
        this.InsertAtBeginning(3);
        this.InsertAtEnd(4);

        this.PintAllNodesData();

    }
}
