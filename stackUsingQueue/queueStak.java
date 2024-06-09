import java.util.*;

public class queueStak {
    public static void main(String[] args) {
        stack st = new stack();
        st.add(12);
        st.add(34);
        while (!st.isEmpty()) {
            System.out.println(st.remove() + " ");
        }

    }

}

class stack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    public void add(int data) {
        if (!q1.isEmpty()) {
            q1.add(data);
        } else {
            q2.add(data);
        }

    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int top = -1;
        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                top = q1.remove();
                if (q1.isEmpty()) {
                    break;
                }
                q2.add(top);
            }
        } else {
            while (!q2.isEmpty()) {
                top = q2.remove();
                if (q2.isEmpty()) {
                    break;
                }
                q1.add(top);
            }
        }

        return top;
    }
}