package Constructor;

public class compare {
    public static void main(String[] gg) {
        zzz z = new zzz();

    }
}

class yyy {
    yyy(int e) {
        System.out.println(" yyy class paramerterized constructor");
    }

}

class zzz extends yyy {
    zzz() {
        super(10);// if directly call the constructor to super keyword not working because
                  // paramertized constructor
        System.out.println("zzz class default constructor");
    }

}