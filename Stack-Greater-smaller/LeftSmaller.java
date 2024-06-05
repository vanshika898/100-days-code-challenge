import java.util.*;

public class LeftSmaller {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int prevSmaller[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();

            }
            if (s.isEmpty()) {
                prevSmaller[i] = -1;
            } else {
                prevSmaller[i] = arr[s.peek()];
            }
            s.push(i);
        }
        System.out.print("[");
        for (int i = 0; i < prevSmaller.length; i++) {
            System.out.print(prevSmaller[i] + ",");
        }
        System.out.println("]");

    }

}
