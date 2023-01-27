package Section_1;

import java.util.Scanner;

public class ValueChecker_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int intVal = 0;

        System.out.println("Please insert your number: ");
        intVal = in.nextInt();

        if (intVal == 7){
            System.out.println("The \"7\" is a LUCKY NUMBER!");
        } else if (intVal == 13){
            System.out.println("The \"13\" is a UNLUCKY NUMBER!");
        }else {
            System.out.println("The number " + intVal + " is neither lucky nor unlucky");
        }
        in.close();
    }
}
