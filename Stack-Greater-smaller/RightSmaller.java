import java.util.*;

public class RightSmaller {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nxtSmaller[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nxtSmaller[i] = -1;
            } else {
                nxtSmaller[i] = arr[s.peek()];
            }
            s.push(i);
        }
        System.out.print("[");
        for (int i = 0; i < nxtSmaller.length; i++) {
            System.out.print(nxtSmaller[i] + ",");
        }
        System.out.println("]");
    }

}
