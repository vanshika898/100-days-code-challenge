
public class q2 {
    public static void main(String[] args) {
        Donkey d = new Donkey();
        Monkey m = new Monkey();
        aaa a = new aaa();
        zoo.sherkhan.eat(d);// 20
        zoo.sherkhan.eat(m);// 10
        // zoo.sherkhan.eat(a); Not compllied because aaa not extends Animal

    }
}

abstract class Animal {
    public int getAge() {
        return 10;
    }
}

class Monkey extends Animal {
    public int getage() {
        return 100;
    }
}

class Donkey extends Animal {
    public int getAge() {
        return 20;
    }
}

class aaa {
    public int getAge() {
        return 200;
    }
}

class Lion {
    public void eat(Animal aa) {
        int x = aa.getAge();
        System.out.println(x);
    }
}

class zoo {
    public static Lion sherkhan = new Lion();
}
