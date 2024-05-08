// Swapping Nodes in a Linked List
// We have a linked list and two keys in it, swap nodes for two given keys. Nodes should be
// swapped by changing links. Swapping data of nodes may be expensive in many situations when
// data contains many fields. It may be assumed that all keys in the linked list are distinct.
// Sample Input 1 : 1->2->3->4, x = 2, y = 4
// Sample Output 1 : 1->4->3->2

public class q4 {
    public static Node head = null;
    public static Node tail = null;

    public void swapped(Node x, Node y) {
        // Node temp = head;
        // Node n = head;
        // while (temp != null) {
        // if (temp == x && n == y) {
        // Node u = x;
        // x = y;
        // y = u;
        // return;
        // }
        // }

    }

    public void print() {

        Node temp = head;
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        q4 r = new q4();
        Node head = new Node(1);

        Node x = new Node(2);
        head.next = x;

        Node z = new Node(3);
        head.next.next = z;

        Node y = new Node(4);
        head.next.next = y;
        r.print();

        r.swapped(x, y);

    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
