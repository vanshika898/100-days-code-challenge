package string2;

public class deep {
    public static void main(String[] args) {
        String g = "hello";
        String m = new String("hello");

        if (g == m) {
            System.out.println("same ");
        } else {
            System.out.println("not same ");
        }

        // Deep comparision
        if (g.equals(m) == true) {
            System.out.println("same ");

        } else {
            System.out.println("not same ");
        }
    }
}

class bbb {
    public static void main(String[] args) {
        String g = "HELLO";
        String m = new String("hello");
        if (g.equals(m) == true) {
            System.out.println("same ");

        } else {
            System.out.println("not same ");
        }
    }
}

// deep comparision with case
class ccc {
    public static void main(String[] args) {
        String g = "HELLO";
        String m = new String("hello");
        if (g.equalsIgnoreCase(m) == true) {
            System.out.println("same ");

        } else {
            System.out.println("not same ");
        }
    }

}

class ddd {
    public static void main(String[] args) {
        String g = "Agra";
        String m = "Goa";
        int x = g.compareTo(m);
        System.out.println(x);

    }

}