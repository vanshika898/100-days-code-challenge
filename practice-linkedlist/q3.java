// In a system there are two singly linked list. By some programming error, the end node of one
// of the linked lists got linked to the second list, forming an inverted Y-shaped list. Write a
// program to get the point where two linked lists merge.
// `
// We have to find the intersection part in this system.

public class q3 {

    public void getIntersection(Node head1, Node head2) {
        while (head1 != null) {
            Node temp = head2;
            while (temp != null) {
                if (head1 == temp) {
                    System.out.println("intersection found at:" + temp.data);
                    return;

                }

                temp = temp.next;
            }

            head1 = head1.next;

        }
        System.out.println("intersection not found");

    }

    public static void main(String[] args) {
        q3 e = new q3();
        Node head1 = new Node(4);
        Node head2 = new Node(1);
        Node temp1 = new Node(5);
        head1.next = temp1;

        Node temp12 = new Node(6);
        head1.next.next = temp12;

        Node temp13 = new Node(7);
        head1.next.next.next = temp13;

        Node temp21 = new Node(2);
        head2.next = temp21;

        Node temp22 = new Node(3);
        head2.next.next = temp22;

        head2.next.next.next = temp12;
        head2.next.next.next.next = temp13;

        e.getIntersection(head1, head2);

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