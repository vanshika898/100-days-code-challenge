
public class defaultC {

    public static void main(String[] gg) {
        sam s = new sam();
        sam s1 = new sam(3);

    }
}

class tom {
    tom() {
        System.out.println("Base class default constructor");
    }
}

class sam extends tom {
    sam() {
        System.out.println("derived class defalut constructor");
    }

    sam(int e) {
        System.out.println("derived class parameterized constructor");
    }
}
