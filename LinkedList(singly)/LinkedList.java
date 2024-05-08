
public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;
    static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
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
        tail = newNode;
        size++;
    }

    public void deleteNNode(int n) {
        int si = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            si++;
        }
        Node prev = head;
        if (n == si) {
            head = head.next;
            return;
        }
        for (int i = 1; i < si - n; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return;

    }

    public void addInBetween(int data, int index) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Found in index:" + i);
                return;
            }
            i++;
            temp = temp.next;

        }

    }

    public int deleteFirst() {
        if (size == 0) {
            System.out.println("Linkedlist is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int temp = head.data;
            head = tail = null;
            size--;
            return temp;
        }
        int val = head.data;

        head = head.next;
        size--;
        return val;

    }

    public int deleteLast() {
        if (size == 0) {
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int temp = head.data;
            head = tail = null;
            size--;
            return temp;

        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        prev = tail;
        size--;
        return val;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(7);
        ll.addFirst(9);
        ll.addLast(10);
        ll.addInBetween(4, 1);
        ll.print();
        ll.search(4);

        ll.deleteNNode(3);
        ll.print();

    }
}