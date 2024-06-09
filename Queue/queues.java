public class queues {
    public static void main(String[] args) {

        Queueue q = new Queueue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }

}

class Queueue {
    static int arr[];
    static int size;
    static int rear;

    public Queueue(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
    }

    public static boolean isEmpty() {
        return rear == -1;
    }

    public static void add(int data) {
        if (rear == arr.length - 1) {
            System.out.println("arrary is full");
            return;
        }
        rear = rear + 1;
        arr[rear] = data;
    }

    public static int remove() {
        if (isEmpty()) {
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear = rear - 1;
        return front;
    }

    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[0];
    }

}