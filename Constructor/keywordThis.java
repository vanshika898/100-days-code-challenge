package Constructor;

public class keywordThis {
    public static void main(String[] args) {
        mmm m = new mmm();
        mmm n = new mmm(10);
    }

}

class mmm {
    mmm() {
        this(10);// this keyword also use to call the constructor
        System.out.println("default constructor");
    }

    mmm(int e) {
        System.out.println("parameterized  constructor");

    }
}