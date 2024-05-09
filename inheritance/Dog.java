package inheritance;

public class Dog {
    public static void main(String[] args) {
        Jump g = new Jump();
        g.jump();
        g.printName();
        g.voice();

    }
}

class gog {
    public void printName() {
        System.out.println("brumo");
    }

    public void voice() {
        System.out.println("Bhow bhow");
    }

}

class Jump extends gog {
    public void jump() {
        System.out.println("jump , jump");
    }

    public void voice() {
        System.out.println("meow meow");
    }
}

class dd {
    public static void main(String[] args) {
        Jump g = new Jump();
        g.jump();
        g.printName();
        g.voice();

    }
}