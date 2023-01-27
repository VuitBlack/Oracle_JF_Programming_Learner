package Section_1;

import java.util.Scanner;

public class AgeChecker_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        char driveLicence;
        int legalAge = 21;

        System.out.println("Please enter your age: ");
        age = in.nextInt();
        System.out.println("Do you have driven licence: ");
        driveLicence = in.next().charAt(0);

        if ((age >= legalAge) && (driveLicence == 'y')){
            System.out.println("You are an ADULT, you CAN hire a car");
        }else
            System.out.println("You are NOT ADULT, you CAN'T hire a car");

        in.close();
    }
}
