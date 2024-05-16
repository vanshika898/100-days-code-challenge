package string2;

public class arr {
    public static void main(String[] args) {
        String arr[] = new String[5];
        arr[0] = "AMIT";
        arr[1] = "ZAHEER";
        arr[2] = "KANTA";
        arr[3] = "GELIYA";
        arr[4] = "BEWKOOF";

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {// compareToIgnoreCase is alos the method to compare string
                    // it ignore all the case
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
