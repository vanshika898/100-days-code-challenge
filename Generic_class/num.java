class aaa<Cartoon> {
    private Cartoon c;

    public void doSomething(Cartoon x) {
        c = x;
    }

    public void whatever() {
        System.out.println(c);
    }

}

class psp {
    public static void main(String[] args) {
        aaa a = new aaa();
        a.doSomething(new Integer(2));
        a.whatever();

    }
}