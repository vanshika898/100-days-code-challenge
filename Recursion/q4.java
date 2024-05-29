package Recursion;

// Sum  of  n natural numbers
public class q4 {
    public static int tot(int n) {
        if (n == 1) {
            return 1;
        }
        return tot(n - 1) + n;
    }

    public static void main(String[] args) {
        System.out.println("sum is:" + tot(4));

    }
}
