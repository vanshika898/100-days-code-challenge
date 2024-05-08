
//check if linked list is palindrome or not
import java.util.LinkedList;

public class q1 {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node getMid(Node head) {
        Node slow = head;
        Node Fast = head;
        while (Fast != null && Fast.next != null) {
            slow = slow.next;
            Fast = Fast.next.next;
        }
        return slow;
    }

    public static boolean palidrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node midNode = getMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node Left = head;
        while (right != null) {
            if (right.data != Left.data) {
                return false;

            }
            Left = Left.next;
            right = right.next;

        }
        return true;

    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;

            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public static void main(String[] args) {
        q1 ll = new q1();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(palidrome());

    }
}
