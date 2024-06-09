
public class queue {

    public static void main(String[] args) {
        Queues q = new Queues();
        q.add(9);
        q.add(2);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();

        }

    }

}

class Queues {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static public Node head = null;
    static public Node tail = null;

    public static boolean isEmpty() {
        return head == null && tail == null;
    }

    public static void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public static int remove() {
        if (isEmpty()) {
            return -1;
        }
        int front = head.data;
        if (tail == head) {
            tail = head = null;

        } else {

            head = head.next;
        }
        return front;

    }

    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }
}
