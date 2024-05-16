public class arrayObject {
    public static void main(String[] args) {
        bulb b[] = new bulb[5];
        System.out.println("setting wattage:");
        // b[0].setWattage(20); This show error that ".NullPointerException: Cannot
        // invoke "bulb.setWattage(int)" because "<local1>[0]" is null
        // at arrayObject.main" because java is treated as object in java so we have to
        // create object first
        // b[1].setWattage(30);

        for (int i = 0; i < b.length; i++) {
            b[i] = new bulb();
        }
        b[0].setWattage(20);
        b[1].setWattage(20);
        b[2].setWattage(20);
        b[3].setWattage(20);
        b[4].setWattage(20);

        System.out.println("getting wattages:");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i].getWattage());
        }

    }

}

class bulb {
    private int wattage;

    public void setWattage(int wattage) {
        this.wattage = wattage;

    }

    public int getWattage() {
        return wattage;
    }
}