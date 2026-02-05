//constructor;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;

        System.out.println("a new node has been created:" + this.data);
    }
}
