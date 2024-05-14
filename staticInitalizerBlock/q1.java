package staticInitalizerBlock;

// Memory allocaton staticMember-->intializerBlocks(non static)-->Constructor
public class q1 {
    public static void main(String[] args) {
        aaa a = new aaa();
        System.out.println(bbb.x);

    }

}

class bbb {
    static public int x = 9;// if not writing static code is not working
}

class aaa {
    static {
        System.out.println("static intializer block 1");
    }

    aaa() {
        System.out.println("default  constructor");
    }

    {
        System.out.println("not static initailizer block");
    }
    static

    {
        System.out.println("static intializer block 2");
    }
}