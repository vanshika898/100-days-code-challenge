package initializerBlocks;

// Output is that before constructor intializer blocks get memeory 
public class q1 {
    public static void main(String[] args) {
        aaa a = new aaa();
        aaa a1 = new aaa(4);

    }
}

class aaa {
    {
        System.out.println("ujjain");
    }

    aaa() {
        System.out.println("default constructor");
    }

    {
        System.out.println("Indore");
    }

    aaa(int e) {
        System.out.println("parameterized  constructor");

    }

    {
        System.out.println("Goa");
    }
}