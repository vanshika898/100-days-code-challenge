class aaa /* extends object if not extends any class */ {
    aaa() {
        super();// automayically super class constructor call
    }
}

public class someConditions {
    public static void main(String[] args) {
        ccc c = new ccc();
    }
}

class bbb {
    bbb() {
        // first super call of object class
        System.out.println("hiii");
    }
}

class ccc extends bbb {
    ccc() {
        super();
        System.out.println("great");

    }

}