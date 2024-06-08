package Queue;

import java.util.Stack;

public class reversed {

    public static void main(String[] args) {

        Queue q = new Queue(10);

        int k = 5;
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        reverseFirstK(q, k);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }

    public static void reverseFirstK(Queue q, int k) {
        if (q.isEmpty() || k > q.size()) {
            return;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(q.remove());
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        int size = q.size() - k;
        for (int i = 0; i < size; i++) {
            q.add(q.remove());
        }
    }
}

class Queue {
    private int arr[];
    private int size;
    private int rear;
    private int front;

    public Queue(int n) {
        arr = new int[n];
        size = 0;
        rear = -1;
        front = 0;
    }

    public void add(int data) {
        if (rear == arr.length - 1) {
            System.out.println("array is full");
            return;
        }
        arr[++rear] = data;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int frontElement = arr[front];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        size--;
        return frontElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public int size() {
        return size;
    }
}
