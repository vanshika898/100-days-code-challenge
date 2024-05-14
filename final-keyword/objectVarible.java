// it is not neccassary to assign the value of object variable so it give the default value of specific type
public class objectVarible {
    public static void main(String[] args) {
        ggg a = new ggg();
        a.aam();
    }
}

class ggg {
    private int x;

    public void aam() {
        System.out.println(x);
    }
}