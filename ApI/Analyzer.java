import java.lang.reflect.*;

class Analyzer {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage java Analyzer class_name");
            return;
        }
        try {
            String classToAnalyze = args[0];
            Class c = Class.forName(classToAnalyze);
            System.out.println("Name (package name included):" + c.getName());
            System.out.println("Simple name :" + c.getSimpleName());
            Method methods[];
            methods = c.getDeclaredMethods();
            System.out.println("Number of methods:" + methods.length);
            Method m;

            String methodsName;
            Class returnType;
            Class Parameters[];
            int j;
            for (int e = 0; e < methods.length; e++) {
                m = methods[e];
                System.out.println("Name of methods :" + m.getName());
                returnType = m.getReturnType();
                System.out.println("Return type of method is: " + returnType);
                Parameters = m.getParameterTypes();
                System.out.println("Number of parameters:" + Parameters.length);
                for (j = 0; j < Parameters.length; j++) {
                    System.out.printf("parameters number %d ,type :%s\n", j + 1, Parameters[j].getName());
                }

                System.out.println("*************************************************************");

            }
            Field fields[] = c.getDeclaredFields();
            System.out.println("Number of fields: " + fields.length);
            for (int e = 0; e < fields.length; e++) {
                Field f = fields[e];
                String fieldName = f.getName();
                Class fieldType = f.getType();
                System.out.printf("Field number %d type %s Name %s\n", e + 1, fieldType.getName(), fieldName);
            }

        } catch (ClassNotFoundException nF) {
            System.out.println("Class : " + nF.getMessage() + "  Not found");

        }
    }

}
