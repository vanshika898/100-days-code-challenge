public class localVariable {
    public static void main(String[] args) {
        final int x;
        x = 0;// only one time we can assigned the value
        // x=0; if double assigned code not complied
        System.out.println(x);
    }
}

class aaa {
    public static void main(String[] args) {
        final int x = 0;
        int y = 1;
        while (y <= 1) {
            // x=5 if we assignned value in the loop of final
            // variable then also code is not working because complier check code
            // syntatically
            y++;
        }
        System.out.println(x);
    }
}