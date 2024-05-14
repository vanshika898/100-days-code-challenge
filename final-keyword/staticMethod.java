class aaa {
    public void sam() {
        System.out.println("great");
        tom();
    }

    static public void tom() {

        System.out.println("cool");
    }
}

public class staticMethod {

    public static void main(String[] args) {
        aaa.tom();
        aaa a = new aaa();
        a.sam();
        a.tom();
    }
}
