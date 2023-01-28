package Section_1;

import java.util.Scanner;

public class ArrayTask_06 {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        Scanner in = new Scanner(System.in);
        int num, numValues = 0;
        boolean valid = true;

        while (numValues == 5) {
            do{
                System.out.println("Insert a new and uniq number: ");
                num = in.nextInt();
            }while (numValues == 5);
        }


    }
}
