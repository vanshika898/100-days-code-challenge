package inheritance;

public class interitance {
    public static void main(String[] args) {
        Box x = new Box();
        x.setBreadth(5);
        x.setHeight(5);
        x.setLength(5);
        System.out.println("breadth is:" + x.getBreadth());
        System.out.println("height is:" + x.getHeight());
        System.out.println("length is:" + x.getLength());

    }
}

class Rectangle {
    private int length;
    private int breadth;

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public int getBreadth() {
        return this.breadth;
    }
}

class Box extends Rectangle {
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

}