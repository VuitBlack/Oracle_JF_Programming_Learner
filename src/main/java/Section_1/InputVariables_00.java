package Section_1;

import java.util.Scanner;

public class InputVariables_00 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean boolVal;
        byte  byteVal;
        char charVal;
        short shortVal;
        int intVal;
        long longVal;
        float floatVal;
        double doubleVal;

        System.out.println("Please enter a boolean value: ");
        boolVal = in.nextBoolean();
        System.out.println("Please enter a byte value: ");
        byteVal = in.nextByte();
        System.out.println("Please enter a char value: ");
        charVal = in.next().charAt(0);
        System.out.println("Please enter a short value: ");
        shortVal = in.nextShort();
        System.out.println("Please enter a int value: ");
        intVal = in.nextInt();
        System.out.println("Please enter a long value: ");
        longVal = in.nextLong();
        System.out.println("Please enter a float value: ");
        floatVal = in.nextFloat();
        System.out.println("Please enter a double value: ");
        doubleVal = in.nextDouble();

        System.out.println("Boolean value: "+boolVal);
        System.out.println("Byte value: "+byteVal);
        System.out.println("Char value: "+charVal);
        System.out.println("Short value: "+shortVal);
        System.out.println("Int value: "+intVal);
        System.out.println("Long value: "+longVal);
        System.out.println("Float value: "+floatVal);
        System.out.println("Double value: "+doubleVal);
    }
}
