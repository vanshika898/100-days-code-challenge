package encapsulation;

public class en2 {

    public static void main(String[] args) {
        bulb b = new bulb();
        b.setWattege(20);
        System.out.println("wattage is:" + b.getWattage());

    }
}

class bulb {
    private int wattage;

    public void setWattege(int wattage) {
        if (wattage >= 0 && wattage <= 240) {
            this.wattage = wattage;
        } else {
            this.wattage = 0;
        }
    }

    public int getWattage() {
        return this.wattage;
    }

}
