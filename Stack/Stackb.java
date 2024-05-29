
public class Stackb {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;

    public static boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!!");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head = head.next;
        return val;

    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        Stackb s = new Stackb();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!isEmpty()) {
            System.out.println(s.pop() + " ");
            s.peek();
        }

    }
}
