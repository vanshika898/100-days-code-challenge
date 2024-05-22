package Input;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inputS {
    public static void main(String[] gg) {
        char m;
        char k;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            System.out.println("enter :");
            m = (char) br.read();
            System.out.println(m);
            while (br.ready())
                br.read();

            System.out.println("enter another char:");
            k = (char) br.read();
            System.out.println(k);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
