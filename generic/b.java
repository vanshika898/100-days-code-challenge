package generic;

public class b {
    public static void main(String[] args) {
        int x = 20;
        Integer j;
        j = new Integer(x);
        System.out.println(j);// boxing

        int k = j.intValue();// unboxing
        System.out.println(k);
    }

}
