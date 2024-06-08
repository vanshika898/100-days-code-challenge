import java.util.*;

public class queue {
    public static void genPrac(int n) {
        if (n == 0) {
            return;
        }
        Queue<String> q = new LinkedList<>();
        int total = 0;
        q.add("1");

        while (total < n) {
            String curr = q.poll();
            System.out.print(curr + " ");
            q.add(curr + "0");
            q.add(curr + "1");
            total++;
        }
    }

    public static void main(String[] args) {
        int n1 = 10;
        genPrac(n1);

    }
}
