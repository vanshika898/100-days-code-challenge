
import java.io.*;

class psp {
    public static void main(String[] args) {
        File f = new File("abcd.txt");
        System.out.println(f.exists());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.length());
        System.out.println(f.getName());

    }

}
