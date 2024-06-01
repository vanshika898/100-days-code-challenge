import java.io.*;

public class MemberMannager {
    private static boolean isOperationValid(String operation) {
        operation = operation.trim();
        String operations[] = { "add", "update", "remove", "getAll", "getByContactNumber", "getByCourse" };
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equalsIgnoreCase(operation))
                return true;

        }
        return false;
    }

    private static boolean isCourseValid(String Course) {
        Course = Course.trim();
        String Courses[] = { "C", "C++", "Java", "Python", "J2EE" };
        for (int i = 0; i < Courses.length; i++) {
            if (Courses[i].equalsIgnoreCase(Course))
                return true;
        }
        return false;

    }

    private static final String DATA_FILE = "member.data";

    private static void add(String[] data) {
        if (data.length != 5) {
            System.out.println("Not enough data to add");
            return;
        }
        String moblieNumber = data[1];
        String name = data[2];
        String course = data[3];
        if (!isCourseValid(course)) {
            System.out.println("Invalid course : " + course);
            System.out.println("enter:[python,java,C,C++,J2EE]");
            return;
        }
        int fee;
        try {
            fee = Integer.parseInt(data[4]);
        } catch (NumberFormatException nof) {
            System.out.println("please enter integers");
            return;
        }
        try {
            File file = new File("member.data");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");

            String fMobileNumber;
            while (randomAccessFile.getFilePointer() < randomAccessFile.length()) {
                fMobileNumber = randomAccessFile.readLine();
                if (fMobileNumber.equalsIgnoreCase(moblieNumber)) {
                    randomAccessFile.close();
                    System.out.println(moblieNumber + "Exists");
                    return;
                }
                randomAccessFile.readLine();
                randomAccessFile.readLine();
                randomAccessFile.readLine();

            }
            randomAccessFile.writeBytes(moblieNumber);
            randomAccessFile.writeBytes("\n");
            randomAccessFile.writeBytes(name);
            randomAccessFile.writeBytes("\n");
            randomAccessFile.writeBytes(course);
            randomAccessFile.writeBytes("\n");
            randomAccessFile.writeByte(fee);
            randomAccessFile.writeBytes("\n");
            randomAccessFile.writeBytes("-------------------------------------------------------");
            randomAccessFile.close();
            System.out.println("Member added");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private static void update(String[] data) {

    }

    private static void remove(String[] data) {

    }

    private static void getAll() {
        try {
            File file = new File(DATA_FILE);
            if (!file.exists()) {
                System.out.println("No members");
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            if (randomAccessFile.length() == 0) {
                randomAccessFile.close();
                System.out.println("No member");
                return;
            }

            String name;
            String mobileNumber;
            String Course;
            int fee;
            int memberCount = 0;
            int totalFee = 0;

            while (randomAccessFile.getFilePointer() < randomAccessFile.length()) {
                mobileNumber = randomAccessFile.readLine();
                name = randomAccessFile.readLine();
                Course = randomAccessFile.readLine();
                fee = Integer.parseInt(randomAccessFile.readLine());

                System.out.printf("%s %s %s %d\n", mobileNumber, name, Course, fee);
                totalFee += fee;
                memberCount += 1;
            }
            randomAccessFile.close();
            System.out.println("Total registrations: " + memberCount);
            System.out.println("Total fee collected: " + totalFee);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private static void getByContactNumber(String[] data) {
        String mobileNumber = data[1];
        String fMobileNumber = "";
        String fname = "";
        String fcourse = "";
        int Ffee = 0;
        boolean Found = false;
        try {
            File file = new File(DATA_FILE);
            if (file.exists() == false) {
                System.out.println("No file exists");
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            if (randomAccessFile.length() == 0) {
                System.out.println("No data found");
                return;
            }

            while (randomAccessFile.getFilePointer() < randomAccessFile.length()) {
                fMobileNumber = randomAccessFile.readLine();
                if (fMobileNumber.equalsIgnoreCase(mobileNumber) == true) {
                    fname = randomAccessFile.readLine();
                    fcourse = randomAccessFile.readLine();
                    Ffee = Integer.parseInt(randomAccessFile.readLine());
                    Found = true;
                    break;
                }
                randomAccessFile.readLine();
                randomAccessFile.readLine();
                randomAccessFile.readLine();

            }
            randomAccessFile.close();
            if (Found == false) {
                System.out.println("No registration found");
                return;
            }
            System.out.println("Name :" + fname);
            System.out.println("Mobile number :" + fMobileNumber);
            System.out.println("Fee :" + Ffee);
            System.out.println("Course :" + fcourse);

        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }

    private static void getByCourse(String[] data) {
        if (data.length != 2) {
            System.out.println("Invalid data");
            return;
        }
        String course = data[1];
        if (isCourseValid(course) == false) {
            System.out.println("Invalid course");
            System.out.println("Enter valid course");
            return;
        }

        try {
            File file = new File(DATA_FILE);
            if (file.exists() == false) {
                System.out.println("No registration   found");
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            if (randomAccessFile.length() == 0) {
                System.out.println("no data in file");
                randomAccessFile.close();
                return;
            }

            String fname;
            String fcourse;
            String fmobileNumber;
            boolean found = false;
            int Ffee = 0;
            while (randomAccessFile.getFilePointer() < randomAccessFile.length()) {
                fmobileNumber = randomAccessFile.readLine();
                fname = randomAccessFile.readLine();
                fcourse = randomAccessFile.readLine();
                try {
                    Ffee = Integer.parseInt(randomAccessFile.readLine());
                } catch (NumberFormatException Noed) {
                    System.out.println(Noed.getMessage());
                }
                if (course.equalsIgnoreCase(fcourse) == true) {
                    System.out.println("Name :" + fname);
                    System.out.println("Mobile number :" + fmobileNumber);
                    System.out.println("Fee :" + Ffee);
                    System.out.println("Course :" + fcourse);
                    found = true;
                    break;

                }

            }
            randomAccessFile.close();
            if (found == false) {
                System.out.println("No registration found");
                return;
            }

        } catch (IOException io) {
            System.out.println(io.getMessage());
        }

    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please specify  an operation:");
            System.out.println("Operations are :[add ,update ,remove ,getAll getByContactNumber ,getByCourseName]");
            return;
        }
        String operation = args[0];
        if (!isOperationValid(operation)) {
            System.out.println("Invalid operation:" + operation);
            System.out.println("Valid operation are[add,update,remove,getAll,getByContactNumber,getByCourse]");
            return;
        }

        if (operation.equalsIgnoreCase("add")) {
            add(args);
        } else {

        }
        if (operation.equalsIgnoreCase("update")) {
            update(args);
        } else {

        }
        if (operation.equalsIgnoreCase("remove")) {
            remove(args);

        } else {
        }
        if (operation.equalsIgnoreCase("getAll")) {
            getAll();
        } else {
        }
        if (operation.equalsIgnoreCase("getByContactNumber")) {
            getByContactNumber(args);
        }
        if (operation.equalsIgnoreCase("getByCourse")) {
            getByCourse(args);
        } else {

        }

    }
}
