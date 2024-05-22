import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputSimple {
    public static void main(String[] args) {
        try {
            int s;
            int k;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter number 1:");
            s = Integer.parseInt(br.readLine());

            System.out.println("Enter number 2:");
            k = Integer.parseInt(br.readLine());

            System.out.println("sum is:" + (s + k));
        } catch (IOException t) {
            System.out.println(t.getMessage());
        }

    }

}
