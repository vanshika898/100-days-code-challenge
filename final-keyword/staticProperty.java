
//One copy of static property is shared by all object
public class staticProperty {
    public static void main(String[] args) {
        bulb b1, b2;
        b1 = new bulb();
        b2 = new bulb();
        b1.setWattage(60);
        b1.setPrice(20);
        System.out.println(b1.getWattage());
        System.out.println(b1.getPrice());
        b2.setWattage(100);
        b2.setPrice(50);
        System.out.println(b2.getWattage());
        System.out.println(b2.getPrice());
        System.out.println(b2.getWattage());
        System.out.println(b2.getPrice());// came 20 but come 50

    }

}

class bulb {
    private int wattage;
    static int price;

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
