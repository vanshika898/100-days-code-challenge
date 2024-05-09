package polymorphism;

// Example of function overloading
public class polymorphism {
    public static void main(String[] args) {
        calculator c = new calculator();
        c.add(1, 2, 3);
        c.add(2, 4);
    }
}

class calculator {
    public void add(int e, int f) {
        System.out.println("sum is :" + (e + f));
    }

    public void add(int e, int f, int g) {
        System.out.println("sum is :" + (e + f + g));

    }
}