class TMArraryList {
    private int collection[];
    private int size;

    public TMArraryList() {
        this.collection = new int[10];
        this.size = 0;
    }

    public void add(int data) {
        if (this.size == collection.length) {
            int temp[] = new int[this.size + 10];
            for (int e = 0; e < this.size; e++) {
                temp[e] = this.collection[e];

            }
            this.collection = temp;

        }
        this.collection[this.size] = data;
        this.size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Exception:Invalid index");
        return this.collection[index];
    }

    public int size() {
        return this.size;
    }
}

class psp {
    public static void main(String[] args) {
        TMArraryList list = new TMArraryList();
        for (int i = 1; i <= 50; i++) {
            list.add(i * 100);
        }
        System.out.println("Size of list is:" + list.size());

        for (int e = 0; e < list.size(); e++) {
            System.out.println(list.get(e));
        }
    }
}
