import java.util.*;
import java.util.LinkedList;

public class Reversed {
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        reverse(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");

        }
        System.out.println();

    }

}
