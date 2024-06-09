
import java.util.Queue;

import java.util.LinkedList;

public class InterLeave {
  public static void interLeave(Queue<Integer> q) {
    Queue<Integer> firstHalf = new LinkedList<>();
    int size = q.size();
    for (int i = 0; i < (size / 2); i++) {
      firstHalf.add(q.remove());
    }
    while (!firstHalf.isEmpty()) {
      q.add(firstHalf.remove());
      q.add(q.remove());
    }

  }

  public static void main(String[] args) {
    Queue<Integer> q1 = new LinkedList<>();
    q1.add(10);
    q1.add(20);
    q1.add(30);
    q1.add(40);
    q1.add(50);
    q1.add(60);
    q1.add(70);
    q1.add(80);
    q1.add(90);
    q1.add(100);
    System.out.println("Original queue: " + q1);
    interLeave(q1);
    System.out.println("Interleaved queue: " + q1);

    while (!q1.isEmpty()) {
      System.out.print(q1.peek() + " ");
      q1.remove();
    }
    System.out.println();
  }
}
