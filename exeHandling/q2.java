package exeHandling;

public class q2 {
    public static void main(String[] ags) {

        aaa a = new aaa();
        try {
            int g = a.sam(20, 0);
            System.out.println(g);
        } catch (ArithmeticException e) {
            System.out.println("Exeception: Cann't divide with zero");
        }
    }

}

class aaa {
    public int sam(int x, int y) {
        return x / y;
    }
}