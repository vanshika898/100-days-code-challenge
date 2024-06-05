import java.util.*;

public class palindrome {
    static int size;
    public static Node head = null;

    public static void push(char data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;

    }

    public static boolean isEmpty() {
        return head == null;
    }

    public static char pop() {
        if (isEmpty()) {
            return ' ';
        }
        if (size == 1) {
            char val = head.data;
            head = null;
            return val;
        }
        char val = head.data;
        head = head.next;
        return val;

    }

    public static char peek() {
        if (isEmpty()) {
            return ' ';
        }
        return head.data;

    }

    public static Node FindMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static boolean checkPallindrome() {
        if (head == null || head.next != null) {
            return true;
        }
        Node midNode = FindMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = midNode;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;

    }

    public static void main(String[] args) {
        palindrome p = new palindrome();
        p.push('a');
        p.push('b');
        p.push('c');
        p.push('b');
        p.push('a');
        System.out.println(checkPallindrome());
        while (!p.isEmpty()) {
            System.out.println(p.peek() + " ");
            p.pop();

        }

    }

}

class Node {
    char data;
    Node next;

    public Node(char data) {
        this.data = data;
        this.next = null;

    }

}