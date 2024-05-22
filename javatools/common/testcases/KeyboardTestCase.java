package javatools.common.testcases;

import javatools.common.src.com.thinking.machines.util.Keyboard;

public class KeyboardTestCase {
    public static void main(String[] args) {
        Keyboard k = new Keyboard();
        String s;
        System.out.print("Enter string:");
        s = k.getString();
        System.out.println("You entered :" + s);
        char c;
        System.out.print("Enter character:");
        c = k.getChar();
        System.out.println("You entered : " + c);

        long l;
        System.out.print("Enter long:");
        l = k.getlong();
        System.out.println("You entered :" + l);

        short st;
        System.out.print("Enter short:");
        st = k.getShort();
        System.out.println("You entered :" + st);

        double d;
        System.out.print("Enter double:");
        d = k.getDouble();
        System.err.println("You entered : " + d);

        float f;
        System.out.print("Enter float:");
        f = k.getFloat();
        System.out.println("You entered:" + f);

        byte bf;
        System.out.print("Enter byte:");
        bf = k.getByte();
        System.out.println("You entered:" + bf);

        int x;
        System.out.print("Enter integer:");
        x = k.getInt();
        System.out.println("You entered:" + x);

    }

}
