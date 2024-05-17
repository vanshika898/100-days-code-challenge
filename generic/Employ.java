package generic;

public class Employ {
    public static void main(String[] args) {
        ModuleA ma = new ModuleA();
        ModuleB mb = new ModuleB();
        employee e1 = ma.getEmployee();
        employee e2 = mb.getEmployee();
        // e1.equals(e2) Wrong for application purpose
        if (e1.equals(e2)) {
            System.out.println("Same");
        } else {
            System.out.println("not same");
        }
        int x = e1.compareTo(e2);
        System.out.println(x);

    }
}

class employee {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;

    }

    public int gettId() {
        return id;

    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;

    }

    public boolean equals(Object other) {
        // if (this.id == other.id) {
        // return true;
        // } else {
        // return false;
        // }

        if (!(other instanceof employee))// correct method
            return false;
        employee e1 = (employee) other;
        return this.id == e1.id;

    }

    public int compareTo(employee other) {

        return this.id - other.id;
    }
    // public compareTo(employee other){ For Comparing name
    // return this.name.compareTo(other.name);
    // }
}

class ModuleA {
    public employee getEmployee() {
        employee e1 = new employee();
        e1.setId(101);
        e1.setName("sammmer");
        return e1;
    }

}

class ModuleB {
    public employee getEmployee() {
        employee e1 = new employee();
        e1.setId(105);
        e1.setName("sammmer");
        return e1;
    }

}