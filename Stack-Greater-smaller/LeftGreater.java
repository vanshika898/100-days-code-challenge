import java.util.*;

public class LeftGreater {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int prevGreater[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();

            }
            if (s.isEmpty()) {
                prevGreater[i] = -1;
            } else {
                prevGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        System.out.print("[");
        for (int i = 0; i < prevGreater.length; i++) {
            System.out.print(prevGreater[i] + ",");
        }
        System.out.println("]");

    }

}
