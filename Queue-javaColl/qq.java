import java.util.*;
import java.util.LinkedList;

public class qq {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(12);
        q.add(2);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

    }
}
