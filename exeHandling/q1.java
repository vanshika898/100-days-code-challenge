// Execption handling (Simple question)

public class q1 {
    public static void main(String[] args) {

        int x, y;
        x = 20;
        y = 10;
        int arr[] = new int[5];

        try {
            int z = x / y;
            System.out.println(z);
            arr[300] = z;
            System.out.println(arr[z]);

        } catch (ArithmeticException ae) {
            System.out.println("Exception: Do not divide with zero");
        } catch (IndexOutOfBoundsException k) {
            System.out.println("Exception: index out of bounds ");

        }

    }

}
