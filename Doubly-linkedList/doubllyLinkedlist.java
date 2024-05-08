// all opertions of doublley linked list

public class doubllyLinkedlist {
    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
        }
        tail.next = newNode;
        newNode.prev = tail;
        newNode = tail;
        size++;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        return val;

    }

    public int removefirst() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        if (head == tail) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.next.prev = null;
        return val;

    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        doubllyLinkedlist dll = new doubllyLinkedlist();
        dll.addFirst(2);
        dll.addFirst(4);
        dll.addLast(5);
        dll.print();
        dll.removeLast();
        dll.print();
        dll.reverse();
        dll.print();

    }
}

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}