// Int is compatible with long 
// Long --> int -> short->byte->double->float->char->boolean
public class q1 {
    public static void main(String[] args) {
        aaa a = new aaa();
        long x = 20;
        int y = 30;
        a.sam(y);
        a.sam(x);
    }
}

class aaa {
    public void sam(long a) {
        System.out.println("method of long parameter");
        System.out.println(a);
    }

    // public void sam(int a) {
    // System.out.println("method of int parameter");
    // System.out.print(a);
    // }
}