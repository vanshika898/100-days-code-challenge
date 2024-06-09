// Creating queue to stack in add function o(n) remove o(1)

import java.util.*;

public class stackQueue {

    public static void main(String[] args) {
        statk st = new statk();
        st.add(12);
        st.add(34);
        while (!st.isEmpty()) {
            System.out.println(st.remove() + " ");
        }

    }
}

class statk {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public void add(int data) {
        if (q1.isEmpty()) {
            q1.add(data);
            return;
        }
        while (!q1.isEmpty()) {
            q2.add(q1.remove());

        }
        q1.add(data);

        while (!q2.isEmpty()) {
            q1.add(q2.remove());

        }

    }

    public int remove() {
        if (q1.isEmpty()) {
            return -1;
        }
        int dr = q1.remove();
        return dr;
    }

    public int peek() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.peek();

    }

}