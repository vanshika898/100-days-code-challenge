// This code is proof of concept that there is pool is maintain in memory ,where in case of g & i address of both are same 
// but in case of r new object is created so ,complier not search in pool directly create object and and give address of that object to r

public class q1 {
    public static void main(String[] args) {
        String g = "hello";
        String h = "Amit";
        String i = "hello";
        if (g == i) {
            System.out.println("Same");
        } else {
            System.out.println("not same");
        }
        String r = new String("hello");
        if (g == r) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

    }
}