//Interface is not alternative to multiple inheristance it is alternative to abstract class 
/*
 * 1.Interface cann't be instancetiated 
 * interface ka object nhi bn sakta
 * 2.Interface ko extend nhi kar sakte
 * 3.interface to implement kiya jata h par |
 * 4.Agar interface me jitni method declared h usko bhi define karna padega
 *  varna us class ko bhi abstract declare karna padega
 * 5.Pehle humko extends likhna hoga phir implements
 * ek class multiple interfaces ko implement kar sakti h
 * ek interface multiple interface ko extend kar sakta h
 * interface me sari properties final hoti h
 */

public class q1 {

    public static void main(String[] args) {
        ccc c = new ccc();
        c.sam();

    }
}

interface aaa {
    public void sam();

    default public void tom() {
        System.out.println("hello");
    }
}

interface bbb extends aaa {
    public void joy();

}

class ccc implements aaa, bbb {
    public void sam() {
        System.out.println("hello");
    }

    public void joy() {

    }

    public void u() {
        tom();
    }
}