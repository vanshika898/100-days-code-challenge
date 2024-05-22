package javatools.common.src.com.thinking.machines.util;

import java.io.*;

public class Keyboard {

    private BufferedReader bufferedReader;

    public String getString() {
        String str;
        try {
            str = bufferedReader.readLine();

        } catch (IOException ioe) {
            str = "";
        }
        return str;
    }

    public Keyboard() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    }

    public char getChar() {
        return getString().charAt(0);
    }

    public char getChar(String message) {
        System.out.println(message);
        return getChar();

    }

    public String getString(String message) {
        System.out.print(message);
        return getString();
    }

    public long getlong() {
        long x;
        try {
            x = Long.parseLong(getString());
        } catch (NumberFormatException noe) {
            x = 0;
        }
        return x;
    }

    public long getlong(String message) {
        System.out.println(message);
        return getlong();
    }

    public int getInt() {
        int x;
        try {
            x = Integer.parseInt(getString());
        } catch (NumberFormatException noe) {
            x = 0;
        }
        return x;
    }

    public int getInt(String message) {
        System.out.println(message);
        return getInt();
    }

    public short getShort() {
        short x;
        try {
            x = Short.parseShort(getString());
        } catch (NumberFormatException noe) {
            x = 0;
        }
        return x;
    }

    public short getShort(String message) {
        System.out.println(message);
        return getShort();
    }

    public byte getByte() {
        byte x;
        try {
            x = Byte.parseByte(getString());
        } catch (NumberFormatException noe) {
            x = 0;
        }
        return x;
    }

    public byte getByte(String message) {
        System.out.println(message);
        return getByte();
    }

    public float getFloat() {
        float x;
        try {
            x = Float.parseFloat(getString());
        } catch (NumberFormatException noe) {
            x = 0;
        }
        return x;
    }

    public float getFloat(String message) {
        System.out.println(message);
        return getFloat();
    }

    public double getDouble() {
        double x;
        try {
            x = Double.parseDouble(getString());
        } catch (NumberFormatException noe) {
            x = 0;
        }
        return x;
    }

    public double getDouble(String message) {
        System.out.println(message);
        return getDouble();
    }

}
