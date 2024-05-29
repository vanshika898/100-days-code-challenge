
public class q2 {
    public static void rec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        rec(n - 1);

    }

    public static void main(String[] args) {
        int k = 10;
        rec(k);
    }

}
