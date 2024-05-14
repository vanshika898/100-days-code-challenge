//System is the class Out is the public static variable of class system and println is the method
// basically out is the pointer that point printStream object  have println method that accept (string,float etc). 
//According  to this example printStream --> aaa   System ---> bbb

class aaa {
    public void sam(int e) {
        System.out.println(e);
    }

    public void sam(char e) {
        System.out.println(e);
    }

    public void sam(String e) {
        System.out.println(e);
    }

    public void sam(double e) {
        System.out.println(e);
    }

    public void sam(float e) {
        System.out.println(e);
    }
}

class bbb {
    static public aaa a = new aaa();

}

public class SysOutPrint {
    public static void main(String[] args) {
        bbb.a.sam(0);
        bbb.a.sam("vanshika");
    }
}