package Section_1;

public class StringOperations_02 {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Ricardo";
        String str3 = "You are " + str2;

        System.out.println("Welcome: " + str3);
        System.out.println("Length: " + str1.length());
        System.out.println("SubString: " + str3.substring(0,5));
        System.out.println("UpperCase: " + str2.toUpperCase());
        // Determine if the value of str1 and str2 are the same
        System.out.println(str1.compareTo(str2));
        //Display the value that tell us whether two strings are the same
        System.out.println(str1.equals(str2));


    }
}
