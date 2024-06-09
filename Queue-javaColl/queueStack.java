
// add operation  in  o(n) and remove and peek o(1)
import java.util.*;

public class queueStack {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(12);
        q.add(34);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

    }
}

class Queue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void add(int data) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());

        }
    }

    public boolean isEmpty() {
        return s1.isEmpty();
    }

    public int remove() {
        if (isEmpty()) {
            return -1;

        }
        int temp = s1.pop();
        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;

        }
        return s1.peek();

    }
}