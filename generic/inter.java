
public class inter {
    public static void main(String[] args) {
        bbb b = new bbb();
        b.doSomething("hello");
    }

}

interface aaa<T> {
    public void doSomething(T x);
}

class bbb implements aaa<String> {
    public void doSomething(String g) {
        System.out.println(g);
    }
}