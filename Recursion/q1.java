// Print Number in increasing order  
public class q1 {
    public static void rec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        rec(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int k = 10;

        rec(k);

    }
}
