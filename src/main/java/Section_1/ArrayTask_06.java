package Section_1;

import java.util.Scanner;

public class ArrayTask_06 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner in = new Scanner(System.in);
        int num, numValues = 0;
        boolean valid;
        while (numValues < numbers.length) {
            do {
                valid = true;
                System.out.println("Insert a new and unique number: ");
                num = in.nextInt();
                for (int i = 0; i < numValues; i++) {
                    if (num == numbers[i]) {
                        System.out.println("The number already exists");
                        valid = false;
                        break;
                    }
                }
            } while (!valid);
            numbers[numValues] = num;
            numValues++;
        }
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        in.close();
    }

}
