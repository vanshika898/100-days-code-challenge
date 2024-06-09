import java.util.*;

public class stackQueue {
    public static void main(String[] args) {
        Queueue q = new Queueue();
        q.add(12);
        q.add(34);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

    }

}

class Queueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public boolean isEmpty() {
        return s1.isEmpty();
    }

    public void add(int data) {
        s1.push(data);
    }

    public int remove() {
        if (s1.isEmpty()) {
            return -1;
        }
        while (!s1.isEmpty()) {

            s2.push(s1.pop());
        }
        int s = s2.pop();
        while (!s2.isEmpty()) {

            s1.push(s2.pop());
        }
        return s;

    }

}