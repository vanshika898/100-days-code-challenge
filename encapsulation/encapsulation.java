package encapsulation;

public class encapsulation {
    private int wattage;

    public void setWattege(int wattage) {
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public static void main(String[] args) {
        encapsulation e = new encapsulation();
        e.setWattege(3);
        System.out.println(e.getWattage());

        // encapsulation r;//proof that java has pointers that take the refernce of
        // encapsulation type object
        // r = null;
        // r.setWattege(3);
        // System.out.println(r.getWattage());

    }
}
