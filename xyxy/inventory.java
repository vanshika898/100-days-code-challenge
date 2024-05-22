package xyxy;

import xyxy.pqr.rxd.TV;
import xyxy.pqr.rxd.lmnop.Bulb;
import xyxy.pqr.rxd.lmnop.Toy;

public class inventory {
    public static void main(String[] args) {
        Bulb b = new Bulb();
        b.setWattage(29);
        System.out.println("wattage is:" + b.getWattage());

        Toy t = new Toy();
        t.setPrice(20);
        System.out.println("price is:" + t.getPrice());

        TV tv = new TV();
        tv.setPrice(10);
        System.out.println("price of TV is:" + tv.getPrice());

    }

}
