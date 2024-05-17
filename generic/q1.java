public class q1 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        aaa<bulb> a1 = new aaa<bulb>();
        a1.setContent(new bulb(30));
        bulb b = a1.getContent();
        System.out.printf("wattage is :" + b.getWattage());
        aaa<Toy> a2 = new aaa<Toy>();
        a2.setContent(new Toy(100));
        Toy t = a2.getContent();
        System.out.printf("\npricee is :" + t.getprice());

    }
}

class bulb {
    private int wattage;

    bulb() {
        wattage = 0;
    }

    bulb(int wattage) {
        this.wattage = wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }
}

class Toy {
    private int price;

    Toy() {
        price = 0;
    }

    Toy(int price) {
        this.price = price;
    }

    public void setprice(int price) {
        this.price = price;
        ;
    }

    public int getprice() {
        return price;
    }
}

class aaa<T> {
    private T x;

    public void setContent(T x) {
        this.x = x;
    }

    public T getContent() {
        return x;
    }
}